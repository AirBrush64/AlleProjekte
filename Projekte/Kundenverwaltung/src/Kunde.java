
public class Kunde {
	
	private String name;
	private int alter;
	
	public Kunde(String name, int alter) {
		
		this.name = name; // direktes setzen
		this.setAlter(alter); // setter verwenden
	}
	
	
	public String getVorname() {
		return name;
	}

	

	public String getName() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		if (alter>0) this.alter = alter;
		else System.out.println("Alter kann net sein!");
	}

	
	
	public boolean unter21() 
	{
		if(alter<21)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	

	@Override
	public String toString() {
		return "Kunde [alter=" + alter + ", name=" + name + "]";
	}

	
}