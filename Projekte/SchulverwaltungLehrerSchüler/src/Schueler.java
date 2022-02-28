class Schueler {
	private int schuelernummer;
	private String name;

	private boolean masernimpfung = false;

	public Schueler(int snummer, String name) {

		this.schuelernummer = snummer;
		this.name = name;

	}

	public int getSchuelernummer() {
		return schuelernummer;
	}

	public void setSchuelernummer(int schuelernummer) {
		this.schuelernummer = schuelernummer;
	}

	public boolean isMasernimpfung() {
		return masernimpfung;
	}

	public void setMasernimpfung() {
		this.masernimpfung = true;
	}

	@Override
	public String toString() {
		return "Schueler [masernimpfung=" + masernimpfung + ", name=" + name + ", schuelernummer=" + schuelernummer
				+ "]";
	}

}