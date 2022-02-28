import java.util.*;

public class Schulamt {

    private static final String BeamteListe = null;
	private String adresse;
    public List<Lehrer> lehrerliste = new ArrayList<Lehrer>();

    public Schulamt(String adr) {
        this.adresse = adr;
    }

    public void addLehrer(Lehrer l) {
        this.lehrerliste.add(l);
    }

    
    public void addBeamter(String vn, String nn, int a, double gg, int es){
        // BeamtenObjekt aus Daten erzeugen
        Beamter b = new Beamter(vn,nn,a, gg,es);
        // in liste einfuegen
        this.lehrerliste.add(b);
    }

    public void addAngLehrer(String vn, String nn, int a, double st, double sl){
        // BeamtenObjekt aus Daten erzeugen
        Angestellter an = new Angestellter(vn, nn, a, st, sl);
        // in liste einfuegen
        this.lehrerliste.add(an);
    }

    public void zeigeLehrer() {
        for (Lehrer l : lehrerliste) {
            l.zeigeDaten();
        }
    }

    public int zaehleAlleLehrerUeber(int alter) {
        int count;
        count = 0;
        for (Lehrer l : lehrerliste) {
            if (l.getAlter() > alter) {
                count++;
            }
        }
        return count;
    }

    public Lehrer sucheLehrer(String n, String vn) {
        Lehrer lehrergefunden = null;
        for (int i=0; i<lehrerliste.size();i++){
            Lehrer l = lehrerliste.get(i);
            if (l.getNachname().equals(n) && l.getVorname().equals(vn)) {
                lehrergefunden = l;
            }
        }
        return lehrergefunden;
    }
    
    public double anteilAngestelleLehrer() {
    	double AngAnzahl = 0;
		for(Lehrer m : lehrerliste) {
			
			if(m instanceof Angestellter) {
				
				Angestellter l = (Angestellter)m;
				AngAnzahl++;
			}
		}
		double Prozentsatz = AngAnzahl / lehrerliste.size() * 100;
		return Prozentsatz;
		
	}
    
    public List<Beamter> beamteMitHoechsterErfahrungsstufe() {
    	
        List<Beamter> BeamtenListe = new ArrayList<Beamter>();
        
		for(Lehrer m : lehrerliste) {
			
			if(m instanceof Beamter) {
				
				Beamter l = (Beamter)m;
				
				if (l.getErfahrungsstufe() == 5) {
					BeamtenListe.add(l);
				}
				
			}
		}
		return BeamtenListe;
    }

	@Override
	public String toString() {
		return "Schulamt [adresse=" + adresse + ", lehrerliste=" + lehrerliste + ", anteilAngestelleLehrer()="
				+ anteilAngestelleLehrer() + ", beamteMitHoechsterErfahrungsstufe()="
				+ beamteMitHoechsterErfahrungsstufe() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
	