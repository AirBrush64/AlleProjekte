
public class testAutoKunde {

	public static void main(String[] args) {
		
		// Objekte a1 erzeugen k1
		Kunde k1 = new Kunde("Max Muster", 21);
		Auto a1 = new Auto("Opel", "Corsa", 5);
		// Objekte zuweisen
		a1.setBesitzer(k1);
		
		// a2 erzeugen 
		Auto a2 = new Auto("Mercedes", "A-Klasse", 6); 

		// Kunde direkt zuweisen mit Kundendaten
		a2.setBesitzer("Elfriede Musterfrau", 34);

		// Daten ausgeben
		a1.zeigeDaten();
		a2.zeigeDaten();
	
		
		
		

	}

}
