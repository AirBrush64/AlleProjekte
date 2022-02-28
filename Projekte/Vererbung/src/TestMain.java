public class TestMain {
	public static void main(String[] args) {
		Beamter ba1 = new Beamter("Hans", "Muster", 35, 2000, 1);
		ba1.zeigeDaten();
		System.out.println("Gehaltl" + ba1.berechneGehalt());
		// Erfahrungsstufe erhoehen
		ba1.erhoeheErfahrungsstufe();
		// Kontrolle, ob erhoeht
		ba1.zeigeDaten();
		System.out.println();
		Angestellter an1 = new Angestellter("Herbeit", "Meier", 45, 2000, 25);
		an1.zeigeDaten();
		System.out.println("Gehaltl" + an1.berechneGehalt());
		// Stundenlohn erhoehen
		an1.erhoeheLohn(25.25);
		// Kontrolle, ob erhoeht:
		an1.zeigeDaten();

        Schulamt s1 = new Schulamt("Teststr. 1, 12345 Testhausen");

        Angestellter an2 = new Angestellter("Helmut", "Test", 45, 24, 25.34);
        
        s1.addLehrer(ba1);
        s1.addLehrer(an2);
        s1.addAngLehrer("Max", "Muster", 38, 24, 22);

        s1.zeigeLehrer();

	}
}
