import java.util.ArrayList;
import java.util.List;

public class Filiale {
	private String Standort;
	private List<Bus> meineBusse;
	
	public Filiale (String standort) {
		Standort = standort;
		meineBusse = new ArrayList<Bus>();
	}
	public void busHinzufügen (Bus m1) {
		meineBusse.add(m1);
	}
	public void zeigeBusseMitFreienSitzplätzen() {
		for(Bus m1: meineBusse) {
			if(m1.getFreiSitzplätze() > 0) {
				m1.zeigeDaten();
			}
		}
	}
}
