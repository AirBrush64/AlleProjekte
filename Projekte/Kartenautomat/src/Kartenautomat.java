import java.util.Scanner;  

   

public class Kartenautomat {  

    public static void main(String[] args) {  

        final java.text.DecimalFormat twoDigits = new java.text.DecimalFormat( "0.00" );  

        int Tarif = 0;  
        double Kartenmenge = 0;  
        double Gesamtbetrag = 0;  
        double Zwischenbetrag = 0;  
        double M�nze = 0;  
        double Gutschein = 0;  
        int Wiederholung = 0;  
        String Entscheidung;  
        String Ja = "Ja";  
        Scanner Karten = new Scanner (System.in); 
        Scanner Nochmal = new Scanner (System.in);  
        Scanner M�nzeneingabe = new Scanner (System.in); 
        Scanner Eingabe = new Scanner (System.in); 

    do {             																											 // Ganze Wiederholung
    																																  
        do {                                                                                                                     // Mehr Karten  

            do {                                                                                                                // Fehlerhafter Tarif  

            System.out.println("---------------------------------------");  
            System.out.println("Willkommen! W�hlen sie ihren Tarif");  
            System.out.println("(1) Zone A: 2,50 Euro");  
            System.out.println("(2) Zone B: 3,70 Euro");  
            System.out.println("(3) Zone C: 5,20 Euro");  
            System.out.println("---------------------------------------");   
            Tarif = Eingabe.nextInt();  
            
            switch (Tarif) {  

            case 1: 

                System.out.println("Wieviele Karten m�chten sie kaufen?");  
                Kartenmenge = Karten.nextInt();  
                Zwischenbetrag = 2.50 * Kartenmenge;  
                Gesamtbetrag = Gesamtbetrag + Zwischenbetrag;  
                System.out.println("Der Zwischenpreis liegt bei " + twoDigits.format(Gesamtbetrag) + "�" );  
                break; 
                
            case 2:  

                System.out.println("Wieviele Karten m�chten sie kaufen?"); 
                Kartenmenge = Karten.nextInt();  
                Zwischenbetrag = 3.70 * Kartenmenge;  
                Gesamtbetrag = Gesamtbetrag + Zwischenbetrag;  
                System.out.println("Der Zwischenpreis liegt bei " + twoDigits.format(Gesamtbetrag) + "�" );  
                break; 
                
            case 3: 

                System.out.println("Wieviele Karten m�chten sie kaufen?"); 
                Kartenmenge = Karten.nextInt();  
                Zwischenbetrag = 5.20 * Kartenmenge;  
                Gesamtbetrag = Gesamtbetrag + Zwischenbetrag;  
                System.out.println("Der Zwischenpreis liegt bei " + twoDigits.format(Gesamtbetrag) + "�" );  
                break; 

 
            default: 

                System.out.println("Ung�ltige Auswahl.");  
                break; 

            }  

        } while (Tarif > 3);                                                                                              // Fehlerhafter Tarif  

            System.out.println("M�chten sie noch weitere Karten kaufen?");  
            Entscheidung = Nochmal.nextLine();  

        } while (Entscheidung.equals(Ja));                                                                   			 // Mehr Karten  



    do {  

            System.out.println("Werfen sie ihre M�nzen ein.");  
            M�nze = M�nzeneingabe.nextDouble();  

            if (M�nze == 0.01) {  
                Gesamtbetrag = Gesamtbetrag - M�nze;   
            }  

            else if (M�nze == 0.02) {  
                Gesamtbetrag = Gesamtbetrag - M�nze;  
            }  

            else if (M�nze == 0.05) {  
                Gesamtbetrag = Gesamtbetrag - M�nze;  
            }  

            else if (M�nze == 0.10) {  
                Gesamtbetrag = Gesamtbetrag - M�nze;  
            }  

            else if (M�nze == 0.20) {  
                Gesamtbetrag = Gesamtbetrag - M�nze;  
            }  

            else if (M�nze == 0.50) {  
                Gesamtbetrag = Gesamtbetrag - M�nze;  
            }  

            else if (M�nze == 1.00) {  
                Gesamtbetrag = Gesamtbetrag - M�nze;  
            }  

            else if (M�nze == 2.00) {  
                Gesamtbetrag = Gesamtbetrag - M�nze;  
            }  

            else {  
                System.out.println("Ung�ltige Auswahl");  
            }  

  
            System.out.println("Es muss noch " + twoDigits.format(Gesamtbetrag) + " � bezahlt werden");  

        } while (Gesamtbetrag > 0);  

        System.out.println("Vielen Dank!");  
        Gutschein = Gesamtbetrag * (-1); 

        if (Gutschein > 0) { 

        System.out.println("Sie bekommen einen " + twoDigits.format(Gutschein) + "� Gutschein"); 
        System.out.println("Sch�nen Tag noch!"); 

        } 

        else if (Gutschein == 0) { 
        System.out.println("Sch�nen Tag noch!"); 

        } 
        
        Gutschein = 0; 
        Gesamtbetrag = 0; 

    } while (Wiederholung == 0);                                                         // Ganze Wiederholung  

  }  

} 