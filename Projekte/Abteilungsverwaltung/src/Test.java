
public class Test {

	public static void main(String[] args) {

		Abteilung a1 = new Abteilung("IT");

		a1.mitarbeiterHinzuf�gen("Elke M�ller", 61, 2000, true);

		a1.mitarbeiterHinzuf�gen("Heiko L�ffel", 34, 8970, false);

		a1.mitarbeiterHinzuf�gen("Miko h�nsen", 34, 10007, false);

		a1.zeigeMitarbeiter();

		a1.sucheMaxGehalt();

		System.out.println("Mitarbeiter gefunden/nicht gefunden: " + a1.sucheMitarbeiter("Elke M�ller"));

		System.out.println("Durchschnittsgehalt in Abteilung: " + a1.berechneDurchschnittsGehalt());

		System.out.println("Mitarbeiter �ber 60: " + a1.zaehleMitarbeiterUeber60());

	}

}