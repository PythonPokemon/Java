package Tag06;

public class Flugzeug extends Luftfahrzeug {
	//Eigenschaften
	private double spannweite;
	private int motorenAnz;
	
	
	//Methoden
	public Flugzeug() {
		super();
		this.spannweite=0.0;
		this.motorenAnz=0;
		
	}
	public Flugzeug(String bezeichnung,double gewicht, int baujahr, double spannweite, int motorenAnz) {
		super(bezeichnung,gewicht,baujahr);
		this.spannweite=spannweite;
		this.motorenAnz=motorenAnz;
	}
	 //Getter/Setter Methode
	public double getSpannweite() {
		return this.spannweite;
	}
	
	public int getMotorenAnz() {
		return this.motorenAnz;
	}

	public void setSpannweite(double spannweite) {
		this.spannweite=spannweite;
		
	}
	
	public void setMotorenAnz(int motorenAnz) {
		this.motorenAnz=motorenAnz;
		
	}
	public String getDaten() {
		String daten="Das Luftfahrzeug hat die Bezeichnung "+this.getBezeichnung()+"\n"+
			"und das Gewicht "+this.getGewicht()+" Tonnen \n"+
			"und Baujahr: "+this.getBaujahr()+"\n"+
			"und Spannweite" +this.getSpannweite()+"\n"+
			"und Anzahl Motoren "+this.getMotorenAnz()+"\n";
		return daten;
}
	
}
