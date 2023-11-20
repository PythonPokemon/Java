package Tag06_OOP1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EINGABE - z.B. Erzeuge ein Objekt mit der Konstruktor-Methode
		Luftfahrzeug b747 = new Luftfahrzeug();
		Luftfahrzeug a311 = new Luftfahrzeug();
		
		//VERARBEITUNG
		b747.setBezeichnung("Boeing 747-8");
		b747.setGewicht(442);
		b747.setBaujahr(1988);
		a311.setBezeichnung("A311");
		a311.setGewicht(71.840);
		a311.setBaujahr(1995);
		
		//AUSGABE
		System.out.println(b747.getDaten());
		System.out.println(a311.getDaten());
	}

}
