import java.util.Scanner;

public class tank {

	public static void main(String[] args) {
		
		        int Tankinhalt; 

		        int Verbrauch; 
		        
		        int Kilometer; 

		         

		        Scanner Eingabe = new Scanner(System.in); 

		        System.out.println("Wieviel Tankinhalt ist vorhanden?"); 

		        Tankinhalt = Eingabe.nextInt(); 

		        System.out.println("Wie hoch ist der Verbrauch (pro 100km)?"); 

		        Verbrauch = Eingabe.nextInt(); 

		        System.out.println("Wieviele Kilometer sollen gefahren werden?"); 

		        Kilometer = Eingabe.nextInt(); 

		        int erg = Kilometer / 100 * Verbrauch;
		        int erg2 = Tankinhalt - erg;
		         

		        if (erg2 > 0 && erg2 <= Tankinhalt ) { 

		            System.out.println("Der Tankinhalt nach der bestimmten Strecke ist: " + erg2); 

		        } 

		        else if (erg2 < 0) { 

		            System.out.println("Der Tankinhalt reicht nicht für diese Strecke"); 

		  

		        } 
		        else if (erg2 > Tankinhalt ) {
		        	
		            System.out.println("Der Tankinhalt reicht nicht für diese Strecke"); 

		        }

		    } 

	}

