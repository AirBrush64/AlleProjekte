import java.util.*;

class test{
    public static void main(String[] args) {
        Schueler s1 = new Schueler(1,"Mustermann");
        Schueler s2 = new Schueler(2,"Musterfrau");
        Schueler s3 = new Schueler(1,"Mustermann2");
        Schueler s4 = new Schueler(2,"Musterfrau2");

        Lehrer l1 = new Lehrer("Musterlehrer", 55);

        Schulklasse k1 = new Schulklasse("12FOSIT1", l1);
        k1.schuelerHinzufuegen(s1);
        k1.schuelerHinzufuegen(s2);

        Schulklasse k2 = new Schulklasse("12FOSMB1", l1);
        k2.schuelerHinzufuegen(s3);
        k2.schuelerHinzufuegen(s4);

        List<Schueler> ungeimpft = k1.nichtMasernGeimpft();
        System.out.println("ungeimpfte SuS:" + ungeimpft);

        System.out.println(k1.toString());

        Schule sch1 = new Schule("EKS Darmstadt");
        sch1.schulklassehinzufuegen(k1);
        sch1.schulklassehinzufuegen(k2);
        sch1.zeigeSchuelerAusKlasse("12ABC0"); // gibt es nicht
        sch1.zeigeSchuelerAusKlasse("12FOSIT1");
        sch1.schuelerAufnehmen("Test", "12FOSIT1");
        System.out.println("Alle Schueler der Schule");
        System.out.println(sch1.liefereAlleSchuelerDerSchueler());

        

    }
}