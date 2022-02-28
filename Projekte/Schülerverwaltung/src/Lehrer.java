public abstract class Lehrer {
	private String Vorname;
	private String Nachname;
	private int Alter;

	Lehrer(String Vorname, String Nachname, int Alter) {
		this.setLehrerDaten(Vorname, Nachname, Alter);
	}

	public void zeigeDaten() {
		System.out.println("Vorname: " + Vorname + " Nachname: " + Nachname + " Alter: " + Alter);

	}

	@Override
	public String toString() {
		return "Lehrer [Vorname=" + Vorname + ", Nachname=" + Nachname + ", Alter=" + Alter + ", berechneGehalt()="
				+ berechneGehalt() + ", getVorname()=" + getVorname() + ", getNachname()=" + getNachname()
				+ ", getAlter()=" + getAlter() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void setLehrerDaten(String Vorname, String Nachname, int Alter) {
		this.Vorname = Vorname;
		this.Nachname = Nachname;
		this.Alter = Alter;
	}

	public double berechneGehalt() {
		return 0;
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public int getAlter() {
		return Alter;
	}

	public void setAlter(int alter) {
		Alter = alter;
	}

}