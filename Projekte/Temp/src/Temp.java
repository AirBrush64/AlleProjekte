import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		
		//Aufgabe 1
		int Messwert = 0;
		int AnzahlMW = 0;
		int Anzahl = 1;

		Scanner Eingabe = new Scanner (System.in);
		
		System.out.println("Wie viele CO2-Konzentrationswerte m�chten sie eingeben?");
		AnzahlMW = Eingabe.nextInt();																// Eingabe der Anzahl von Messwerten
		int Messwerte[]= new int[AnzahlMW];															// Array wird mit der gr��e von AnzahlMW erstellt
		for (int i = 0; i < Messwerte.length ; i++) {												// Alle Messwerte werden solange eingegeben, bis die Anzahl der Eingaben so gro� wie Messwert.lenght ist
			System.out.println("Bitte geben sie den " + Anzahl +". CO2-Konzentrationswert ein." );
			Messwert = Eingabe.nextInt();
			Messwerte[i] = Messwert;
			Anzahl = Anzahl + 1;
        }
	
		//Aufgabe 2
		int Summe = 0;
		
		for (int a = 0; a < Messwerte.length ; a++) {												//Alle eingegebenen Messwerte werden durchgegangen und zu Summe summiert

			Messwert = Messwerte[a];
			Summe = Summe + Messwert;
		}
		double DurchschnittCO2 = Summe / Messwerte.length;												//Durchschnitt wird mit Hilfe von Summe und Messwert.lenght gebildet
		System.out.println("Der Durchschnitt betr�gt: "+ DurchschnittCO2);
	
		//Aufgabe 3
		int Max = 0;
		for (int b = 0; b < Messwerte.length ; b++) {												/*Alle eingegebenen Messwerte werden durchgegangen und die Variable Max wird immer dann �berschrieben,
																									wenn der jetzige Messwert gr��er ist als der vorherige*/
			if (Messwerte[b] > Max){																	
				Max =  Messwerte[b];

			}
		}
		System.out.println("Der Gr��te Messwert ist "+ Max +".");

        //Aufgabe 4
		int nL�ften = 0;
		for (int c = 0; c < Messwerte.length ; c++) {												/*Alle Messwerte werden duchgegangen und nL�ften wird immer um 1 gr��er, 
																									wenn der Messwert bei �ber 1000ppm liegt */
			Messwert = Messwerte[c];
			if( Messwert > 1000){
				
				nL�ften = nL�ften + 1;
		    
			}
		}
		if (nL�ften >=1) {																			//Wenn nL�ften gr��er oder gleich als 1 ist, dann wurde nicht gel�ftet und wenn nicht dann wurde gel�ftet
			System.out.println("Es wurde nicht gel�ftet.");
		}
		else {
			System.out.println("Es wurde gel�ftet.");
		}


		// Aufgabe 5
		int �ber = 0;
		for (int d = 0; d < Messwerte.length ; d++) {												//Alle Messwerte werden durchgegangen und alle Messwerte die �ber 1000ppm liegen werden gez�hlt und dann ausgegeben

			Messwert = Messwerte[d];
			if( Messwert > 1000){
					
				�ber++;
				
			}
		}
		System.out.println("Es liegen " + �ber + " �ber dem kritischen Wert (1000ppm).");
			
		//Aufgabe 6
		int nrealistisch = 0;
		for (int e = 0; e < Messwerte.length ; e++) {												/*Alle Messwerte werden durchgegangen und die die kleiner als 0 sind werden gez�hlt und wenn nrealistisch 
																									gr��er oder gleich 1 ist dann wurde nicht gel�ftet und wenn dies nicht der Fall ist dann wurde gel�ftet*/
			Messwert = Messwerte[e];
			if( Messwert < 0){
					
				nrealistisch = nrealistisch + 1;
				
			}
		}
		if (nrealistisch >=1) {
			System.out.println("Nicht alle Angaben sind realistisch.");
		}
		else {
			System.out.println("Alle Angaben sind realistisch.");
		}
	} 
}   