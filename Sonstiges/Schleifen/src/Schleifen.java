import java.util.Scanner;

public class Schleifen {
	public static void main(String[] args) {
		
		int Zahl = 0;
		int Zahl2;
		System.out.println("Bis wohin soll gezählt werden?");
		Scanner zahl_end = new Scanner (System.in);
		Zahl2 = zahl_end.nextInt();
		while (Zahl <= Zahl2) {
			System.out.println("Zahl: "+Zahl);
			Zahl = Zahl + 1;
		}
	}
}
