package Dateien;

import java.util.Scanner;

public class Bsp8_fktmR_Kreis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EINGABE
		float r=eingabe();
		
		//VERARBEITUNG
		float A = 3.141f*r*r;
		
		//AUSGABE
		System.out.println("Die Fläche vom Kreis beträgt "+ A+" cm².");		
	}
	
	public static float eingabe() {
		Scanner objvar=new Scanner(System.in);
		System.out.println("Bitte den Radius in cm eingeben: ");
		float radius = objvar.nextFloat();
		objvar.close();
		return radius;
	}
	
}
