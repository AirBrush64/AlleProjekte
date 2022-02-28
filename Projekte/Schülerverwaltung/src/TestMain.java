public class TestMain {
    public static void main(String[] args) {
        Schulamt s1 = new Schulamt("Teststr. 1, 12345 Testhausen");
        
        Beamter ba1 = new Beamter("Michaela", "Musterfrau", 56, 2240.45, 5);
        

        Angestellter an2 = new Angestellter("Helmut", "Test", 45, 24, 25.34);
        
        s1.addLehrer(ba1);
        s1.addLehrer(an2);
        s1.addAngLehrer("Max", "Muster", 38, 24, 22);
        s1.addAngLehrer("Max", "Kluster", 38, 24, 22);

        s1.zeigeLehrer();
        
        System.out.println("Prozentsatz der Angestellten: " + s1.anteilAngestelleLehrer() + "%");
        System.out.println(s1.beamteMitHoechsterErfahrungsstufe());

    }
}