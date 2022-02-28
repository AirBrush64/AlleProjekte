import java.util.Scanner;

public class SchleifeSumme {

	public static void main(String[] args) {
		
		int SummeEnd;
		int Summe = 0;
		int z = 1;
		System.out.println("Bis wohin soll die Summe gebildet werden?");
		Scanner Eingabe = new Scanner (System.in);
		SummeEnd = Eingabe.nextInt();
		while (z <= SummeEnd) {
			
			Summe = Summe + z;
			z = z + 1;
	
		}
		System.out.println(Summe);
	}

}
