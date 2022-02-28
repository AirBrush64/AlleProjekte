import java.util.ArrayList;
import java.util.List;

public class Schule {
    private String schulname;
    private List<Schulklasse> meineSchulklassen = new ArrayList<Schulklasse>();
    private List<Lehrer> meineLehrer = new ArrayList<Lehrer>();
    private int schuelerID = 0; // eindeutige ID fuer schueler (schulweit)
    

    public Schule(String schulname) {
        this.schulname = schulname;
    }

    public void schulklassehinzufuegen(Schulklasse k){
        if (this.sucheSchulklasse(k.getBezeichnung()) == null){
            // keine Klasse mit gleicher ID gefunden
            // einfuegen
            meineSchulklassen.add(k);
        }else{
            System.out.println("Fehler: Klasse existiert bereits!");
        }
           
    }
    
    public void schuelerAufnehmen(String name, String klassenbezeichnung){
        // Es wird die schuelerID verwendet
        // fuer jeden eingefuegten Schueler wird diese um 1 hochgezaehlt
        // -> eindeutig, allerdings nur, wenn ausschliesslich diese Methode
        // verwendet wird, um Schueler zu erzeugen
        
        // Schueler erzeugen
        Schueler s1 = new Schueler(this.schuelerID, name);
        // Der Klasse zuweisen, die Klasse muss existieren
        Schulklasse kl = this.sucheSchulklasse(klassenbezeichnung);
        if (kl != null) {
            kl.schuelerHinzufuegen(s1);
            this.schuelerID++;
        }else{
            System.out.println("Fehler: Die Klasse existiert nicht!");
        }


    }

    public void lehrerhinzufuegen(Lehrer l){
        this.meineLehrer.add(l);
    }

    public List<Lehrer> lehrerUeber60(){
        List<Lehrer> lehrerUe60 = new ArrayList<>();
        for(Lehrer l: meineLehrer){
            if (l.getAlter()>60) lehrerUe60.add(l);
        }
        return lehrerUe60;
    }

    

    public int anzahlSchueler(){
       int anzahlSuS=0;
        for (Schulklasse sk:meineSchulklassen){
            anzahlSuS += sk.anzahlSchuerler();
        }
        return anzahlSuS;
    }

    public Schulklasse sucheSchulklasse(String bezeichnung){
        Schulklasse rueck = null;
        for (Schulklasse sk:meineSchulklassen){
            if(sk.getBezeichnung().equals(bezeichnung)) {
                rueck = sk;
                break; // Klasse gefunden, Schleife abbrechen
            }
        }
        return rueck;
    }

    public void zeigeSchuelerAusKlasse(String bezeichnung){
        Schulklasse sk = this.sucheSchulklasse(bezeichnung);
        if (sk != null){
            System.out.println(sk.getMeineSchueler());
        }else{
            System.out.println("Fehler: Klasse existiert nicht");
        }
    }

    public void sucheSchueler(int id){
        boolean gefunden = false;
        // Es muss jede Klasse durchsucht werden
        for (Schulklasse sk:meineSchulklassen){
            Schueler s = sk.sucheSchueler(id);
            if (s != null){
                System.out.println("Schueler gefunden");
                System.out.println(s.toString());
                gefunden = true;
                break;
            }
            // Schueler nicht in Klasse, naechste Klasse durchsuchen
        }
        if (!gefunden) System.out.println("Schueler existiert in keiner Klasse");
    }

   

    public List<Schueler> liefereAlleSchuelerDerSchueler(){
        List<Schueler> alleSchueler = new ArrayList<Schueler>();
        // alle Klassen durchgehen
        for (Schulklasse kl:meineSchulklassen){
            // Schueler aus Klasse holen
            List<Schueler> sl = kl.getMeineSchueler();
            // alle Schueler in Liste kopieren
            for (Schueler s:sl){
                alleSchueler.add(s);
            }
        }

        return alleSchueler;
    }

    @Override
    public String toString() {
        return "Schule [meineLehrer=" + meineLehrer + ", meineSchulklassen=" + meineSchulklassen + ", schulname="
                + schulname + "]";
    }

    
}