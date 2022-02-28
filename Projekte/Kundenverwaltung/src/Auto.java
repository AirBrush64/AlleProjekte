
public class Auto 
{
	
	private String herstellername;
	private String modellname;
	private int haftpflichklasse;
	
	// Das Auto merkt sich seinen Besitzer vom Typ Kunde
	private Kunde besitzer;
	
	
	public Auto(String herstellername,  String modellname, int haftpflichklasse) 
	{
		
		this.herstellername = herstellername;
		this.modellname = modellname;
		this.haftpflichklasse = haftpflichklasse;
		
	}

	public void setBesitzer(String name, int alter) 
	{
		this.besitzer = new Kunde(name, alter);
	}
	

	public void setBesitzer(Kunde besitzer) 
	{
		this.besitzer = besitzer;
	}

	public double berechneJahresbeitrag() 
	{
		double betrag = (this.haftpflichklasse * 7)+50;
		if(this.besitzer.unter21()==true)
		{
			return betrag * 1.5;
		}
		else
		{
			return betrag;
		}
	}
	
	public void zeigeDaten() 
	{
				
		System.out.println("Autodaten:");
		System.out.println("Hersteller: "+herstellername);
		System.out.println("Modelname: "+modellname);
		System.out.println("Haftpflichtklasse: "+haftpflichklasse);
		System.out.println("Besitzerdaten:" + this.besitzer.toString());
		
		
	}
}