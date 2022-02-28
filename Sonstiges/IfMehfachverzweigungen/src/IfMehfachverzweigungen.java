import java.util.Scanner;

public class IfMehfachverzweigungen {
	public static void main(String[] args) {
		
		int Zahl;
		
		Scanner Eingabe = new Scanner (System.in);
		System.out.println("Nennen sie mir eine Zahl");
		Zahl = Eingabe.nextInt();
		if (Zahl == 0) {
			System.out.println("Die eingegebene Zahl ist gleich Null");
		}
			else if (Zahl > 0) {
				System.out.println("Die eingegebene Zahl ist größer als Null");
			}
			else{
				System.out.println("Die eingegebene Zahl ist kleiner als Null");
				
			}
		}
	}
