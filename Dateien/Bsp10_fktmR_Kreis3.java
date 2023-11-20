package Dateien;

import java.util.Scanner;

public class Bsp10_fktmR_Kreis3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EINGABE
		float r=eingabe();
		
		//VERARBEITUNG
		float fläche = kreisflaeche(r);
		
		//AUSGABE
		ausgabe(fläche);		
	}
	
	public static float eingabe() {
		Scanner objvar=new Scanner(System.in);
		System.out.println("Bitte den Radius in cm eingeben: ");
		float radius = objvar.nextFloat();
		objvar.close();
		return radius;
	}
	
	public static float kreisflaeche(float radius) {
		float A = 3.141f*radius*radius;
		return A;
	}	
	
	public static void ausgabe(float A) {
		System.out.println("Die Fläche vom Kreis beträgt "+ A+" cm².");
	}
}
