package switchcase;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		int Zahl;
		
		Scanner Ergebnis = new Scanner (System.in);
		System.out.println("Nenne mir eine Zahl zwischen 0 bis 3");
		Zahl = Ergebnis.nextInt();
		switch (Zahl) {
		case 0:
			System.out.println("Du hast die Zahl Null eingegeben");break;
		case 1: 
			System.out.println("Du hast die Zahl Eins eingegeben");break;
		case 2: 
			System.out.println("Du hast die Zahl Zwei eingegeben");break;
		case 3: 
			System.out.println("Du hast die Zahl Drei eingegeben");break;
			
		}
	}
}
