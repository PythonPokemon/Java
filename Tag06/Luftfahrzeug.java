package Tag06;

public abstract class Luftfahrzeug {
	//Eigenschaften
	private String bezeichnung;
	private double gewicht;
	private int baujahr;
	
	//Methoden
	//Konstruktor-Methode
	public Luftfahrzeug() {
		this.bezeichnung="objektname";
		this.gewicht=0.0;
		this.baujahr=0;
	}
	public Luftfahrzeug(String bezeichnung, double gewicht, int baujahr) {
		this.bezeichnung=bezeichnung;
		this.gewicht=gewicht;
		this.baujahr=baujahr;
	}
	
	//Getter-/Setter-Methoden
	public String getBezeichnung() {
		return this.bezeichnung;
	}
	public double getGewicht() {
		return this.gewicht;
	}
	public int getBaujahr() {
		return this.baujahr;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung=bezeichnung;
	}
	public void setGewicht(double gewicht) {
		this.gewicht=gewicht;
	}
	public void setBaujahr(int baujahr) {
		this.baujahr=baujahr;
	}
	//weitere Methoden
	public abstract String getDaten() ;
		
	}

