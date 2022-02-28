public class Mitarbeiter {

	private String Name;

	private int Alter;

	private double Gehalt;

	private boolean Abteilungsleiter;

	public Mitarbeiter(String name, int alter, double gehalt, boolean abteilungsleiter) {

		super();

		Name = name;

		Alter = alter;

		Gehalt = gehalt;

		Abteilungsleiter = abteilungsleiter;

	}

	public boolean getAbteilungsleiter() {

		return Abteilungsleiter;

	}

	public void setAbteilungsleiter(boolean abteilungsleiter) {

		Abteilungsleiter = abteilungsleiter;

	}

	public double getGehalt() {

		return Gehalt;

	}

	public void setGehalt(double gehalt) {

		Gehalt = gehalt;

	}

	public String getName() {

		return Name;

	}

	public void setName(String name) {

		Name = name;

	}

	public int getAlter() {

		return Alter;

	}

	public void setAlter(int alter) {

		Alter = alter;

	}

	@Override

	public String toString() {

		return "Mitarbeiter [Name=" + Name + ", Alter=" + Alter + ", Gehalt=" + Gehalt + ", Abteilungsleiter="

				+ Abteilungsleiter + "]";

	}

}