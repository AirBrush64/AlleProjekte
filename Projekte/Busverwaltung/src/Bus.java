import java.util.ArrayList;
import java.util.List;

public class Bus {
	private int Fahrzeugnummer;
	private int MaxSitzpl�tze;
	private int FreiSitzpl�tze;
	private Mitarbeiter Fahrer;
	
	
	
	public Bus (int fahrzeugnummer,int maxSitzpl�tze, int freiSitzpl�tze) {
		super();
		
		Fahrzeugnummer = fahrzeugnummer;
		MaxSitzpl�tze = maxSitzpl�tze;
		FreiSitzpl�tze = freiSitzpl�tze;
		
		
	}
	
	public void setFahrer (Mitarbeiter x) {
		this.Fahrer = x;
	}
	public void setFahrer (String Name,double Gehalt) {
		Mitarbeiter x = new Mitarbeiter (Name,Gehalt);
		this.Fahrer = x;
	}
	public void zeigeDaten () {
		System.out.println("Fahrzeugnummer: " + this.Fahrzeugnummer);
		System.out.println("Max.Sitze " + this.MaxSitzpl�tze);
		System.out.println("Freie Pl�tze: " + this.FreiSitzpl�tze);
		System.out.println("Mein Fahrer: ");
		if (this.Fahrer != null) {
			System.out.println("Name Fahrer: " + this.Fahrer.getName());
			System.out.println("Gehalt: " + this.Fahrer.getGehalt());
		}

	}
	public boolean buchen (int Anzahl) {
		boolean buchen = true;
		if (this.FreiSitzpl�tze < Anzahl) {
			FreiSitzpl�tze = FreiSitzpl�tze - Anzahl;
		}
		else {
			buchen = false;
		}
		return buchen;
	}
	public int getFreiSitzpl�tze() {
		return FreiSitzpl�tze;
	}
	}
	

