import java.util.ArrayList;
import java.util.List;

public class Mitarbeiter {
	private String Name;
	private double Gehalt;
	
	
	public Mitarbeiter (String name, double gehalt) {
		
		super();
		
		Name = name;
		Gehalt = gehalt;
		
}
	public void setName (String name) {
		Name = name;
	}
	public String getName() {
		
		return Name;
	}
	public void setGehalt (double gehalt) {
		Gehalt = gehalt;
	}
	public double getGehalt() {
		return Gehalt;
	}
	@Override
	public String toString() {
		return "Mitarbeiter [Name=" + Name + ", Gehalt=" + Gehalt + "]";
	}
	
}
