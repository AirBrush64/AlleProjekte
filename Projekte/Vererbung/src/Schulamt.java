import java.util.*;

public class Schulamt {

    private String adresse;
    public List<Lehrer> lehrerliste = new ArrayList<Lehrer>();

    public Schulamt(String adr) {
        this.adresse = adr;
    }

    public void addLehrer(Lehrer l) {
        this.lehrerliste.add(l);
    }

    
    public void addBeamter(String vn, String nn, int a, double gg, int es){
        // BeamtenObjekt aus Daten erzeugen
        Beamter b = new Beamter(vn,nn,a, gg,es);
        // in liste einfuegen
        this.lehrerliste.add(b);
    }

    public void addAngLehrer(String vn, String nn, int a, double st, double sl){
        // BeamtenObjekt aus Daten erzeugen
        Angestellter an = new Angestellter(vn, nn, a, st, sl);
        // in liste einfuegen
        this.lehrerliste.add(an);
    }

    public void zeigeLehrer() {
        for (Lehrer l : lehrerliste) {
            l.zeigeDaten();
        }
    }

    public int zaehleAlleLehrerUeber(int alter) {
        int count;
        count = 0;
        for (Lehrer l : lehrerliste) {
            if (l.getAlter() > alter) {
                count++;
            }
        }
        return count;
    }

    public Lehrer sucheLehrer(String n, String vn) {
        Lehrer lehrergefunden = null;
        for (int i=0; i<lehrerliste.size();i++){
            Lehrer l = lehrerliste.get(i);
            if (l.getNachname().equals(n) && l.getVorname().equals(vn)) {
                lehrergefunden = l;
            }
        }
        return lehrergefunden;
    }

}