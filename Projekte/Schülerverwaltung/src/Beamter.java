public class Beamter extends Lehrer {

	private double Grundgehalt;
	private int Erfahrungsstufe;

	@Override
	public void zeigeDaten() {
		super.zeigeDaten();

		System.out.println("Ist ein Beamter");
		System.out.println("Grundgehalt " + this.Grundgehalt);
		System.out.println("Erfahrungsstufe " + this.Erfahrungsstufe);

	}

	@Override
	public double berechneGehalt() {

		int Aufschlag = Erfahrungsstufe * 100;
		double Gehalt = Grundgehalt + Aufschlag;
		System.out.println("Gehalt beträgt: " + Gehalt);
		return Gehalt;

	}

	public void ERFerhöhen() {
		if (Erfahrungsstufe < 5) {
			Erfahrungsstufe = Erfahrungsstufe + 1;
			System.out.println("Erfahrungsstufe: " + Erfahrungsstufe);
		}
	}

	public Beamter(String Vorname, String Nachname, int Alter, double grundgehalt, int erfahrungsstufe) {

		super(Vorname, Nachname, Alter);
		this.Grundgehalt = grundgehalt;
		this.Erfahrungsstufe = erfahrungsstufe;

	}

	public double getGrundgehalt() {

		return Grundgehalt;
	}

	public void setGrundgehalt(double grundgehalt) {
		Grundgehalt = grundgehalt;
	}

	public int getErfahrungsstufe() {
		return Erfahrungsstufe;
	}

	public void setErfahrungsstufe(int erfahrungsstufe) {
		if (erfahrungsstufe > 5 && erfahrungsstufe < 0) {
			System.out.println("Maximale Stufe ist 5");
		} else {
			Erfahrungsstufe = erfahrungsstufe;
		}
	}

	@Override
	public String toString() {
		return "Beamter [Grundgehalt=" + Grundgehalt + ", Erfahrungsstufe=" + Erfahrungsstufe + ", berechneGehalt()="
				+ berechneGehalt() + ", getGrundgehalt()=" + getGrundgehalt() + ", getErfahrungsstufe()="
				+ getErfahrungsstufe() + ", getVorname()=" + getVorname() + ", getNachname()=" + getNachname()
				+ ", getAlter()=" + getAlter() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}