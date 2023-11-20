package Tag03_EVA;

import java.util.Scanner;

public class Jahreszeiten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EINGABE
		Scanner objvar=new Scanner(System.in);
		System.out.println("Bitte eine ganze Zahl eingeben: ");
		int a = objvar.nextInt();
		
		//VERARBEITUNG
		switch (a) {
			case 1: System.out.println("Herbst"); break;
			case 2: System.out.println("Winter"); break;
			case 3: System.out.println("Frühling"); break;
			case 4: System.out.println("Sommer"); break;
			default: System.out.println("Fehler!");
		}
		objvar.close();
	}

}
