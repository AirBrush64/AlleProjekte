import java.util.Scanner;

public class MatheB {
																					// Keine Parameter und kein Rückgabe wert
	static void berechneQuaderVolumen () {
		Scanner eingabe = new Scanner (System.in);
		double Volumen=0;
																					// Die Eingaben der Seiten längen 
		System.out.println("Geben sie die Seitenlängen des Quaders an");

		System.out.println("Geben sie die Länge a ein");
		double a = eingabe.nextDouble ();

		System.out.println("Geben sie die Breite b ein"); 
		double b = eingabe.nextDouble();

		System.out.println("Geben sie die Höhe c ein");
		double c = eingabe.nextDouble();

		if (a >= 0 && b >= 0 && c >= 0) { 											// Überprüfung ob die Werte fehlerhaft sind
			Volumen= a*b*c; 														// Berechnung mit Ausgabe
			System.out.println("Das Volumen des Quarders beträgt "+ Volumen);
		}else {
			System.out.println("Werte sind fehlerhaft"); 							// Fehlermeldung wenn die werte unter null sind 
		} 

	}// r und h werden übergeben besitzt kein Rückgabe Wert
	static void berechneZylinderVolumen (double r, double h) {
		// Variablen erstellt
		double Volumen=0;
		double pi=Math.PI ;
		if(r>0 && h>0) { 															// Überprüfung ob die Werte fehlerhaft sind (ob sie über null sind)
			Volumen=pi*r*r*h; 														// berechnung
																					// Ausgabe Endergebnis
			System.out.println("Das Volum von ihrem Zylinder beträgt: "+Volumen);
		}else {
			System.out.println("Fehler Meldung"); 									// Fehlermeldung wenn der Wert unter null ist
		}

	}																				// Es werden die Parameter n und x übergeben es besitzt kein Rückgabe Wert
	static void xHochN (double n, double x) {
																					// Variablen erstellt
		double Ergebnis =1;
																					// for Schleife geht so lange bis i =(Hochzähler variable) größer oder gleich n =(potenz) ist
		for ( int i=1; i<=n; ++i) {
			Ergebnis = Ergebnis*x; 													// Berechnung des Ergebnis (Ergebnis wird immer überschrieben)
		}
		System.out.println("Das Ergebnis ist: "+ Ergebnis);							// Nach der schleife wird das Ergebnis ausgegeben

	}																				// Es werden die Parameter m, x und b  übergeben es besitzt ein Rückgabe Wert (Ergebnis)
	static double berechneFunktionswertLinFkt (double m, double x, double b) {
		double Ergebnis=0;															// Variable erstellt
		Ergebnis = m*x+b;															// Berechnung des Ergebnis
		return Ergebnis; 															// Das Ergebnis wird zurückgegeben 

	}																				// Es werden die Parameter m, b, start und ende übergeben es besitzt kein Rückgabe Wert
	static void berechneWertetabelleLinFkt (double m, double b, double start, double ende) {
		int x=0; 																	// Variable erstellt
		System.out.println( "x | y" );												// Anfang der Werte tabelle wird ausgegeben
		for (x=(int) start; x <= ende; x++) { 										// In der for Schleife wird x den start Wert übergeben und läuft dann so lange bis x größer als das ende ist
			double Ergebnis= m*x+b; 												// Berechnug des Ergebnises 
			System.out.println(x+" | "+Ergebnis); 									// Ausgabe der Wertetabelle
		}
	}																				// Es werden die Parameter p und q übergeben es besitzt kein Rückgabe Wert
	static void berechneNullstellenQuadFktPQ (double p, double q) {
																					// Variablen erstellt
		double einfach=0;
		double n1=0;
		double n2=0;

		einfach=p/2*p/2-q;
		if(q>0) {																	// Fehlermeldung wenn die Parabel keine Nullstellen besitzt
			System.out.println("Fehlermeldung"); 
		}else {
			// Beechnug der Nullstellen
			n1 = -p/2 + Math.sqrt(einfach);
			n2 = -p/2 - Math.sqrt(einfach);
			System.out.println("Die erste Nullstelle ist "+n1); 					// Ausgabe der Nullstellen
			System.out.println("Die zweite Nullstelle ist "+n2);
		}

	}																				// Es werden die Parameter zahl1 übergeben es besitzt einen Rückgabe Wert (grade)
	static boolean istGerade (double zahl1) {
		boolean grade= true;														// Der boolean wird auf true gesetzt
		if (zahl1 % 2 == 0) { 														// Die zahl1 wird durch 2 wenn ein rest übrich bleibt ist die zahl1 nicht grade
			return grade=true;
		}else {
			return grade=false;
		}
	}																				// Es werden die Parameter zahl2 übergeben es besitzt einen Rückgabe Wert (prim)
	static boolean istPrimzahl (int zahl2) {
		boolean prim=true;															// Eer boolean prim wird auf true gesetzt
		int Rechner=(int) Math.sqrt(zahl2); 										// Von der zahl2 wird die Wurtzel gezogen
		if (zahl2<=0) { 															// Wenn die Zahl2 kleiner als null ist, ist es keine Primzahl
			prim=false;
		}else {																		// Wenn nicht 
			for(int i=2; i<=Rechner+1; i++) { 										// Die for Schleife läuft so lange bis i größer oder gleich Rechner ist 
				if(zahl2 % i !=0) { 
					prim=true;
				}else {
					prim=false;
				}
				break;}

		}
		return prim;
	}


public static void main(String[] args) {
	
	System.out.println("Welche Methode möchten sie aufrufen?");
	System.out.println("--------------------------------------");
	System.out.println("1.BerechneQuaderVolumen");
	System.out.println("2.BerechneZylinderVolumen");
	System.out.println("3.xHochN");
	System.out.println("4.BerechneFunktionswertLinFkt");
	System.out.println("5.BerechneWertetabelleLinFkt");
	System.out.println("6.BerechneNullstellenQuadFktPQ");
	System.out.println("7.istGerade");
	System.out.println("8.istPrimzahl");
	System.out.println("--------------------------------------");
	
	Scanner Eingabe1 = new Scanner (System.in);
	int Entscheidung = Eingabe1.nextInt();
	
	if (Entscheidung == 1) {
		MatheB.berechneQuaderVolumen();
	}
	else if (Entscheidung == 2) {
		double r = 5;
		double h = 2;
		
		MatheB.berechneZylinderVolumen(r, h);
	}
	else if (Entscheidung == 3) {
		double n = 3;
	    double x = 4;
		MatheB.xHochN(n, x);
	}
	else if (Entscheidung == 4) {
		double m = -1.5;
		double x = -2;
		double b = 5;
		
		MatheB.berechneFunktionswertLinFkt(m, x, b);
	}
	else if (Entscheidung == 5) {
		int m = 6;
		int b = -3;
		int start = 1;
		int ende = 3;
		MatheB.berechneWertetabelleLinFkt(m, b, start, ende);
	}
	else if (Entscheidung == 6) {
		double p = 2;
		double q = -8;
	
		MatheB.berechneNullstellenQuadFktPQ(p, q);
	}
	else if (Entscheidung == 7) {
		double zahl1 = 12;
		System.out.println(MatheB.istGerade(zahl1));
	}
	else if (Entscheidung == 8) {
		double zahl2 = 5;
		System.out.println(MatheB.istPrimzahl(0));
	}
}
}
	




