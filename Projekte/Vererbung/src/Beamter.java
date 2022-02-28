public class Beamter extends Lehrer {
    private double grundgehalt;
    private int erfahrungsstufe = 0;

    public Beamter(String vn, String nn, int alter, double grundgehalt, int erfahrungsstufe) {
        super(vn, nn, alter);
        this.grundgehalt = grundgehalt;
        // ueberpruefen, ob Erfahrungsstufe zwischen 0 und 5 liegt
        if (erfahrungsstufe >= 0 && erfahrungsstufe <= 5)
            this.erfahrungsstufe = erfahrungsstufe;
    }

    public void erhoeheErfahrungsstufe() {
       // kann Erfahrungsstufe noch erhoeht werden (max 5)
    	if (erfahrungsstufe < 5)
            erfahrungsstufe++; // Stufe um eins erhoehen
    }

    @Override
    public double berechneGehalt() {
        return grundgehalt + 100 * erfahrungsstufe;
    }

    @Override
    public void zeigeDaten() {
        // zeigeDaten-Methode von Elternklasse aufrufen
    	// um Namen und Alter auszugeben
    	super.zeigeDaten();
    	System.out.println("Grundgehalt:"+this.grundgehalt);
    	System.out.println("Erfahrungsstufe:"+this.erfahrungsstufe);
        
    }

    
    public double getGrundgehalt() {
        return grundgehalt;
    }

    public int getErfahrungsstufe() {
        return erfahrungsstufe;
    }
}