public class Angestellter extends Lehrer {

	private double Stundenanzahl;
	private double Stundenlohn;

	public Angestellter(String Vorname, String Nachname, int Alter, double stundenanzahl, double stundenlohn) {

		super(Vorname, Nachname, Alter);
		this.Stundenanzahl = stundenanzahl;
		this.Stundenlohn = stundenlohn;
	}

	public double getStundenanzahl() {
		return Stundenanzahl;
	}

	public void setStundenanzahl(double stundenanzahl) {
		Stundenanzahl = stundenanzahl;
	}

	public double getStundenlohn() {
		return Stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) {
		Stundenlohn = stundenlohn;
	}

	@Override
	public double berechneGehalt() {
		double ergebnis = 0;
		ergebnis = this.Stundenanzahl * this.Stundenlohn;
		return ergebnis;

	}

	public void stundenlohnerhöhung(double betrag) {
		this.Stundenlohn = this.Stundenlohn + betrag;
	}

	@Override
	public void zeigeDaten() {

		super.zeigeDaten();
		System.out.println("Ist ein Angestellter");
		System.out.println(" Anzahl der Stunden:" + this.Stundenanzahl + " Stundenlohn:" + this.Stundenlohn);

	}

	@Override
	public String toString() {
		return "Angestellter [Stundenanzahl=" + Stundenanzahl + ", Stundenlohn=" + Stundenlohn + ", getStundenanzahl()="
				+ getStundenanzahl() + ", getStundenlohn()=" + getStundenlohn() + ", berechneGehalt()="
				+ berechneGehalt() + ", getVorname()=" + getVorname() + ", getNachname()=" + getNachname()
				+ ", getAlter()=" + getAlter() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}