package Tag03_EVA;

import java.util.Scanner;

public class GutenTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EINGABE
		Scanner objvar = new Scanner(System.in);
		String vorname = new String();
		System.out.println("Bitte geben Sie ihren Vornamen ein:");
		vorname = objvar.nextLine();
		
		//VERARBEITUNG
		String ausgabe=new String();
		ausgabe = "Guten Tag "+vorname+"!";
		
		//AUSGABE
		System.out.println(ausgabe);
		objvar.close();	
	}
}
