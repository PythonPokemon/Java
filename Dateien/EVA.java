package Dateien;

import java.util.Scanner;

public class EVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EINGABE
		Scanner objvar=new Scanner(System.in);
		System.out.println("Bitte eine ganze Zahl eingeben: ");
		int a = objvar.nextInt();
		
		//VERARBEITUNG
		int summe;
		summe=a+10;
		
		//AUSGABE
		System.out.println(summe);
		objvar.close();
	}

}
