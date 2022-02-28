import java.util.Scanner;

public class Übung {

	public static void main(String[] args) {
		
		int Anzahl;
		double Wert;
		Scanner Eingabe = new Scanner (System.in);
		
		System.out.println("Wieviele Werte möchten sie eingeben?");
		Anzahl = Eingabe.nextInt();
		double [] tempInCelsius = new double[Anzahl];
	
		
		for (int i = 0; i < Anzahl;i++) {
			System.out.println("Geben sie einen Wert ein");
			Wert = Eingabe.nextDouble();
			
			
			if (Wert > 70) {
				System.out.println("Fehlerhafte Eingabe");
				i--;
			}
			else {
			 tempInCelsius[i] = Wert;
			 
			 
			}
			
		}
		System.out.println(tempInCelsius[0]);
		System.out.println(tempInCelsius[1]);

	}

}
