package test;

import java.util.Scanner;

public class test {
	
	
	static void berechneWertetabelleLinFkt (double m, double b, double start, double ende) {
		int x=0; 																	// Variable erstellt
		System.out.println( "x | y" );												// Anfang der Wertetabelle wird ausgegeben
		for (x=(int) start; x <= ende; x++) { 										// In der for Schleife wird x den start Wert übergeben und läuft dann so lange bis x größer als das ende ist
			double Ergebnis= m*x+b; 												// Berechnug des Ergebnises 
			System.out.println(x+" | "+Ergebnis); 									// Ausgabe der Wertetabelle
		}
	}

public static void main(String[] args) {
	
		int m = 6;																	// Testfall Nr.5
		int b = -3;																	// Funktioniert. Eine Wertetabelle wird erzeugt mit den Werten
		int start = 1;																// X1= 3, X2= 9, X3= 15.
		int ende = 3;
		test.berechneWertetabelleLinFkt(m, b, start, ende);
}
}