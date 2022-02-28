
public class Test {

	public static void main(String[] args) {

		Abteilung a1 = new Abteilung("IT");

		a1.mitarbeiterHinzufügen("Elke Müller", 61, 2000, true);

		a1.mitarbeiterHinzufügen("Heiko Löffel", 34, 8970, false);

		a1.mitarbeiterHinzufügen("Miko hänsen", 34, 10007, false);

		a1.zeigeMitarbeiter();

		a1.sucheMaxGehalt();

		System.out.println("Mitarbeiter gefunden/nicht gefunden: " + a1.sucheMitarbeiter("Elke Müller"));

		System.out.println("Durchschnittsgehalt in Abteilung: " + a1.berechneDurchschnittsGehalt());

		System.out.println("Mitarbeiter über 60: " + a1.zaehleMitarbeiterUeber60());

	}

}