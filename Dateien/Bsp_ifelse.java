package Dateien;

import java.util.Scanner;

public class Bsp_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EINGABE
		Scanner objvar=new Scanner(System.in);
		System.out.println("Bitte eine ganze Zahl eingeben: ");
		int x = objvar.nextInt();
		
		//VERARBEITUNG
		String ausgabe=new String();
		if (x<0) {
			ausgabe="negativ";
		} else {
			ausgabe="positiv";
		}
		
		//AUSGABE
		System.out.println("Zahl ist "+ausgabe+".");
		objvar.close();
	}

}
