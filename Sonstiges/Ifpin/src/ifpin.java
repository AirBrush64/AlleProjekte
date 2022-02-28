import java.util.Scanner;

public class ifpin {
	public static void main(String[] args) {
		int pin;
		
		Scanner Eingabe = new Scanner (System.in);
		System.out.println("Nennen sie mir ihren vierstelligen Pin.");
		pin = Eingabe.nextInt();
		if (pin>=1000 && pin<=9999) {											// komplexere if-Bedingungen (S.59)
			System.out.println("Herzlich Willkommen");
		}
		else {
			System.out.println("Der Pin ist nicht vierstellig!");
			}
		}
	}

