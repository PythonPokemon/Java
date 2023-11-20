package Dateien;

import java.util.Scanner;

public class Bsp9_fktmR_Kreis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EINGABE
		float r=eingabe();
		
		//VERARBEITUNG
		float fläche = kreisflaeche(r);
		
		//AUSGABE
		System.out.println("Die Fläche vom Kreis beträgt "+ fläche+" cm².");
	}
	
	public static float eingabe() {
		Scanner objvar=new Scanner(System.in);
		System.out.println("Bitte den Radius in cm eingeben: ");
		float radius = objvar.nextFloat();
		return radius;
	}
	
	public static float kreisflaeche(float radius) {
		float A = 3.141f*radius*radius;
		return A;
	}
}
