	import java.util.Scanner;
	import java.util.Random;

	public class SchereSteinPapier1 {

		public static void main(String[] args) {

			String Schere = "Schere"; 
			String Stein = "Stein";
			String Papier = "Papier";
			String Entscheidung;
			String Entscheidung2;
			String Ja = "Ja";
			String ja = "ja";
			
			java.util.Scanner Eingabe = new Scanner (System.in);
			System.out.println("Möchten sie Schere,Stein,Papier spielen?");
			Entscheidung = Eingabe.nextLine();
			
			if (Entscheidung.equals(Ja) || Entscheidung.equals(ja)) {
				System.out.println("---3---");
				System.out.println("---2---");
				System.out.println("---1---");		

			}
			else if (Entscheidung != Ja) {
				System.out.println("Schade! Vielleicht ein andern Mal");
				System.exit(0);
			}
			Entscheidung2 = Eingabe.nextLine();
		    if (Entscheidung2.equals(Schere) || Entscheidung2.equals(Stein) || Entscheidung2.equals(Papier)) {
		    	String [] arr = {"Schere", "Stein", "Papier"};
		        Random random = new Random();

		        int select = random.nextInt(arr.length); 

		        System.out.println("BOT: " + arr[select]); 
		        
		        if (arr[select].equals(Entscheidung2)) {
		        	System.out.println("Unentschieden!");
		        }
		        else if (Entscheidung2.equals(Schere) && arr[select].equals(Stein)) {
		        	System.out.println("Verloren!");
		        }
		        else if (Entscheidung2.equals(Stein) && arr[select].equals(Papier)) {
		        	System.out.println("Verloren!");
		        }
		        else if (Entscheidung2.equals(Papier) && arr[select].equals(Schere)) {
		        	System.out.println("Verloren!");
		        }
		        else if (Entscheidung2.equals(Stein) && arr[select].equals(Schere)) {
		        	System.out.println("Gewonnen!");
		        }
		        else if (Entscheidung2.equals(Papier) && arr[select].equals(Stein)) {
		        	System.out.println("Gewonnen!");
		        }
		        else if (Entscheidung2.equals(Schere) && arr[select].equals(Papier)) {
		        	System.out.println("Gewonnen!");
		        }
		    }
		   else if (Entscheidung2 != Schere || Entscheidung2 != Stein || Entscheidung2 != Papier) {
		        System.out.println("Ungültige Antwort");
		        System.exit(0);
		     }
		 }
	}


