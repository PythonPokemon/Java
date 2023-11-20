package Tag06;


		public class Heissluftballon extends Luftfahrzeug {
		//Eigenschaften
		private double ballonVolumen;
		private double korbhöhe;
		
		
		//Methoden
		public Heissluftballon() {
			super();
			this.ballonVolumen=0.0;
			this.korbhöhe=0.0;
			
		}
		public Heissluftballon(String bezeichnung, double gewicht, int baujahr, double ballonVolume, double korbhöhe) {
			super(bezeichnung,gewicht,baujahr);
			this.ballonVolumen=ballonVolume;
			this.korbhöhe=korbhöhe;
		
		}
		 //Getter/Setter Methode
		public double getballonVolume() {
			return this.ballonVolumen;
		}
		
		public void setBallonVolumen(double ballonVolume) {
			this.ballonVolumen=ballonVolume;
		}

		public double getkorbhöhe() {
			return this.korbhöhe;
			
		}
		
		public void setKorbhöhe(double korbhöhe) {
			this.korbhöhe=korbhöhe;
			
		}
		
		public String getDaten() {
			String daten="Das Luftfahrzeug hat die Bezeichnung "+this.getBezeichnung()+"\n"+
				"und das Gewicht "+this.getGewicht()+" Tonnen \n"+
				"und Baujahr: "+this.getBaujahr()+ "\n"+
				"und ballonVolume" +this.getballonVolume()+ "\n"+
				"und Korbhöhe "+this.getkorbhöhe()+ "\n";
			return daten;
		
		}
		
	}






