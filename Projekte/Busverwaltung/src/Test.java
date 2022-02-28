
public class Test {

	public static void main(String[] args) {
		
		Bus m1 = new Bus(1,12,2);
		Bus m2 = new Bus(2,24,6);
		Filiale Natfan = new Filiale("Darmstadt");
		Mitarbeiter x = new Mitarbeiter ("HansPeterMunk", 3444);
		
		
		m1.setFahrer(x);
		
		m1.setFahrer("Heins", 3000);
		m2.setFahrer("Karl", 4500);
	    
		m1.zeigeDaten();
		m2.zeigeDaten();
		
		System.out.println(m1.buchen(3));
		
		Natfan.busHinzufügen(m1);
		Natfan.zeigeBusseMitFreienSitzplätzen();

	}

}
