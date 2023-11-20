package Dateien;

import java.util.Scanner;

public class Bsp7_fkt0R_Rechteck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EINGABE
		Scanner objvar=new Scanner(System.in);
		System.out.println("Bitte die Länge in cm eingeben: ");
		float Länge = objvar.nextFloat();
		System.out.println("Bitte die Breite in cm eingeben: ");
		float Breite = objvar.nextFloat();
		
		//VERARBEITUNG
		flaechenberechnung(Länge,Breite);
		
		//AUSGABE	
		objvar.close();		
	}
	
	public static void flaechenberechnung(float a,float b) {
		float A = a*b;
		System.out.println("Die Fläche des Rechtecks mit der Länge "+a+
				" und der Breite "+b+" beträgt "+A+" cm².");
	}
}
