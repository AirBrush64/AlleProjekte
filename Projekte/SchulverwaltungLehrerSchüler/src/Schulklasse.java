import java.util.*;

class Schulklasse {
	private String bezeichnung;
	private Lehrer klassenlehrer;
	private List<Schueler> meineSchueler = new ArrayList<Schueler>();

	public Schulklasse(String bezeichnung, Lehrer kl) {
		this.bezeichnung = bezeichnung;
		this.klassenlehrer = kl;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public List<Schueler> getMeineSchueler() {
		return meineSchueler;
	}

	public void setMeineSchueler(List<Schueler> meineSchueler) {
		this.meineSchueler = meineSchueler;
	}

	public void schuelerHinzufuegen(Schueler s) {
		if (meineSchueler.size() < 30) {
			meineSchueler.add(s);
		} else {
			System.out.println("Fehler: Klasse ist voll");
		}
	}

	public List<Schueler> nichtMasernGeimpft() {
		List<Schueler> ungeimpft = new ArrayList<Schueler>();
		for (Schueler s : meineSchueler) {
			if (!s.isMasernimpfung())
				ungeimpft.add(s);
		}
		return ungeimpft;

	}

	public int anzahlSchuerler() {
		return meineSchueler.size();
	}

	public Schueler sucheSchueler(int id) {
		Schueler gefunden = null;
		for (Schueler s : meineSchueler) {
			if (s.getSchuelernummer() == id)
				gefunden = s;
			break;
		}
		return gefunden;
	}

	@Override
	public String toString() {
		return "Schulklasse [bezeichnung=" + bezeichnung + ", klassenlehrer=" + klassenlehrer + ", meineSchueler="
				+ meineSchueler + "]";
	}

}