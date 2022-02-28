import java.util.Scanner;

public class ZählenNegativPositiv {

	public static void main(String[] args) {
		
		int Zahl = 0;
		int Anzahl = 0;
		int Anzahl2 = 1;
		int i = 0;
		int groesser = 0;
		int kleiner = 0;
		
		Scanner Eingabe = new Scanner (System.in);
		
		
		System.out.println("Wieviele Zahlen möchten sie eingeben?");
		Anzahl = Eingabe.nextInt();
		while (i < Anzahl) {
			System.out.println("Bitte geben sie die " + Anzahl2 +".Zahl ein" );
			Zahl = Eingabe.nextInt();
			if (Zahl < 0) {
				kleiner = kleiner + 1;	
			}
			else if (Zahl > 0) {
				groesser = groesser + 1;
			}
			i = i + 1;
			Anzahl2 = Anzahl2 + 1;
		}
		System.out.println("Es wurden " + kleiner + " negative Zahlen und " + groesser + " positive Zahlen eingegeben");
		

	}

}