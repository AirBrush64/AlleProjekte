public abstract class Lehrer {
    protected String vorname;
    protected String nachname;
    protected int alter;

   
    Lehrer(String vn, String nn, int alter) {
        this.vorname = vn;
        this.nachname = nn;
        this.alter = alter;
    }

    public void zeigeDaten() {
        System.out.println("Name: "+this.nachname);
        System.out.println("Vorname: "+this.vorname);
        System.out.println("Vorname: "+this.alter);
    }

    public abstract double berechneGehalt();

   
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }
}