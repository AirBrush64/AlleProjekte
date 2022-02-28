import java.util.Scanner;

public class Ifanweisungen {
	public static void main(String[] args) {
		int Alter;
		String Vorname;
		String Nachname;
		
		
		Scanner Eingabe = new Scanner (System.in);
		System.out.println("Wie alt sind sie?");
		Alter = Eingabe.nextInt();
		if (Alter>= 18) {
			Scanner EingabeName = new Scanner (System.in);
			System.out.println("Was ist dein Vorname?");
			Vorname = EingabeName.nextLine();
			System.out.println("Was ist dein Nachname?");
			Nachname = EingabeName.nextLine();
			System.out.println("Hallo " +Vorname+ " " +Nachname+ " schön dich kennenzulernen!");
		}
		else if (Alter < 18) {
			System.out.println("Sie sind leider zu jung");
			Runtime.getRuntime().exit(Alter);
		}
	}
}
