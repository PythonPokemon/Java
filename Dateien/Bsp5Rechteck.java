package Dateien;

import java.util.Scanner;

public class Bsp5Rechteck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objvar=new Scanner(System.in);
		int progwdh=1;
		do {
			//EINGABE

			System.out.println("Bitte die Länge in cm eingeben: ");
			float a = objvar.nextFloat();
			System.out.println("Bitte die Breite in cm eingeben: ");
			float b = objvar.nextFloat();
			
			//VERARBEITUNG
			float A = a*b;
			
			//AUSGABE
			System.out.println("Die Fläche des Rechtecks mit der Länge "+a+" und der Breite "+b+" beträgt "+A+" cm².");
			//Abfrage Programmneustart?
			System.out.println("Soll das Programm neu starten? 1=Ja, 0=Nein");
			progwdh=objvar.nextInt();
		}while(progwdh==1);
		objvar.close();
	}
}
