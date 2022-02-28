import java.util.ArrayList;
import java.util.List;

public class Bus {
	private int Fahrzeugnummer;
	private int MaxSitzplätze;
	private int FreiSitzplätze;
	private Mitarbeiter Fahrer;
	
	
	
	public Bus (int fahrzeugnummer,int maxSitzplätze, int freiSitzplätze) {
		super();
		
		Fahrzeugnummer = fahrzeugnummer;
		MaxSitzplätze = maxSitzplätze;
		FreiSitzplätze = freiSitzplätze;
		
		
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
		System.out.println("Max.Sitze " + this.MaxSitzplätze);
		System.out.println("Freie Plätze: " + this.FreiSitzplätze);
		System.out.println("Mein Fahrer: ");
		if (this.Fahrer != null) {
			System.out.println("Name Fahrer: " + this.Fahrer.getName());
			System.out.println("Gehalt: " + this.Fahrer.getGehalt());
		}

	}
	public boolean buchen (int Anzahl) {
		boolean buchen = true;
		if (this.FreiSitzplätze < Anzahl) {
			FreiSitzplätze = FreiSitzplätze - Anzahl;
		}
		else {
			buchen = false;
		}
		return buchen;
	}
	public int getFreiSitzplätze() {
		return FreiSitzplätze;
	}
	}
	

