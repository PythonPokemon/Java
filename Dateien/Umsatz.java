package Dateien;

import java.util.Scanner;

public class Umsatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EINGABE
		Scanner objvar = new Scanner(System.in);
		System.out.println("Bitte den Umsatz eingeben: ");
		double umsatz = objvar.nextDouble();
		
		//VERARBEITUNG
		int rabatt;
		if (umsatz<=1000) {
			rabatt=1;
		} else {
			if(umsatz<=2500) {
				rabatt=3;
			}else {
				if(umsatz<=5000) {
					rabatt=5;
				}else {
					if(umsatz<10000) {
						rabatt=7;
					} else {
						rabatt=10;
					}
				}
			}
		}
		
		//Berechnung von Zahlbetrag und RabattEUR
		double RabattEUR = umsatz * rabatt/100;
		double Zahlbetrag = umsatz-RabattEUR;
		
		//AUSGABE
		System.out.println("Der Rabatt in EUR beträgt "+RabattEUR+" EUR.");
		System.out.println("Folgender Zahlbetrag "+Zahlbetrag+" EUR ist zu zahlen.");
		objvar.close();		
	}
}
