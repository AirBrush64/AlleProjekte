import java.util.Scanner;

public class SchleifenWiederholung {
	public static void main(String[] args) {
		
		int Wiederholung = 1;
		Scanner Eingabe = new Scanner (System.in);
		while (Wiederholung == 1) {
			System.out.println("Hallo");
			System.out.println("Hallo!");
			System.out.println("Hallo!!");
			System.out.println("Nochmal? 1 für ja");
			Wiederholung = Eingabe.nextInt();
		}
		
	}
}
