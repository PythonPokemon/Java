package Tag06;


	public class Test {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//EINGABE - z.B. Erzeuge ein Objekt mit der Konstruktor-Methode
			Flugzeug b747 = new Flugzeug("Boeing 747-8",442,1988,5.5,4);
			Flugzeug a311 = new Flugzeug();
			//Heissluftballon hlb3 = new Heissluftballon("Ultra Magic 3", 0, 478, 2018, 4000, 1.1);

			
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
			//System.out.println(hlb3.getDaten());
			
		}

	}	
	
	
	
	

