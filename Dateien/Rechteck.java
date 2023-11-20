package Dateien;

import java.util.Scanner;

public class Rechteck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EINGABE
		Scanner objvar=new Scanner(System.in);
		System.out.println("Bitte die Länge in cm eingeben: ");
		float a = objvar.nextFloat();
		System.out.println("Bitte die Breite in cm eingeben: ");
		float b = objvar.nextFloat();
		
		//VERARBEITUNG
		float A = a*b;
		
		//AUSGABE
		System.out.println("Die Fläche des Rechtecks mit der Länge "+a+" und der Breite "+b+" beträgt "+A+" cm².");
		objvar.close();		
	}
}
