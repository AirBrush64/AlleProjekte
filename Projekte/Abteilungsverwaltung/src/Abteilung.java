import java.util.*;

public class Abteilung {

	private String Bezeichnung;

// private Mitarbeiter meineMitarbeiter; 

	private List<Mitarbeiter> meineMitarbeiter;

	public void mitarbeiterHinzufügen(Mitarbeiter x) {

		this.meineMitarbeiter.add(x);

	}

	public void mitarbeiterHinzufügen(String Name, int Alter, double Gehalt, boolean Abteilungsleiter) {

		Mitarbeiter m1 = new Mitarbeiter(Name, Alter, Gehalt, Abteilungsleiter);

		this.meineMitarbeiter.add(m1);

	}

	public void zeigeMitarbeiter() {

		System.out.println(meineMitarbeiter.toString());

	}

	public int zaehleMitarbeiterUeber60() {

		int counter = 0;

		for (int i = 0; i < meineMitarbeiter.size(); i++) {

			Mitarbeiter m = meineMitarbeiter.get(i);

			if (m.getAlter() > 60) {

				counter = counter + 1;

			}

		}

		return counter;

	}

	public double berechneDurchschnittsGehalt() {

		double insgGehalt = 0;

		for (int i = 0; i < meineMitarbeiter.size(); i++) {

			Mitarbeiter m = meineMitarbeiter.get(i);

			insgGehalt = insgGehalt + m.getGehalt();

		}

		double Durchschnitt = insgGehalt / meineMitarbeiter.size();

		return Durchschnitt;

	}

	public Mitarbeiter sucheMitarbeiter(String Name) {

		Mitarbeiter result = null;

		for (int i = 0; i < meineMitarbeiter.size(); i++) {

			Mitarbeiter y = meineMitarbeiter.get(i);

			if (y.getName().equals(Name)) {

				result = y;

			}

		}

		return result;

	}

	public void sucheMaxGehalt() {

		double Max = 0;

		for (int i = 0; i < meineMitarbeiter.size(); i++) {

			Mitarbeiter t = meineMitarbeiter.get(i);

			if (t.getGehalt() > Max) {

				Max = t.getGehalt();

			}

		}

		System.out.println("Maximales Gehalt in Abteilung: " + Max);

	}

	public Abteilung(String bezeichnung) {

		super();

		Bezeichnung = bezeichnung;

		meineMitarbeiter = new ArrayList<Mitarbeiter>();

	}

	public String getBezeichnung() {

		return Bezeichnung;

	}

	public void setBezeichnung(String bezeichnung) {

		Bezeichnung = bezeichnung;

	}

	public List<Mitarbeiter> getMeineMitarbeiter() {

		return meineMitarbeiter;

	}

	public void setMeineMitarbeiter(List<Mitarbeiter> meineMitarbeiter) {

		this.meineMitarbeiter = meineMitarbeiter;

	}

}
