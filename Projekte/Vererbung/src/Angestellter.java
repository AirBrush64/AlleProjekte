public class Angestellter extends Lehrer {
    private double stunden;
    private double stundenlohn;
  

    public Angestellter(String vn, String nn, int alter, double stunden, double stundenlohn) {
        super(vn, nn, alter);
        this.stunden = stunden;
        this.stundenlohn = stundenlohn;
    }

    public void erhoeheLohn(double betrag) {
        this.stundenlohn += betrag;
    }

    @Override
    public double berechneGehalt() {
        return stunden * stundenlohn;
    }

    @Override
    public void zeigeDaten() {
        super.zeigeDaten();
        System.out.println("Stundenlohn:"+this.stundenlohn);
        System.out.println("Anzahl Stunden"+this.stunden);
    }

   
    public double getStunden() {
        return stunden;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

   
}