package Tag04_KSFkt;

import java.util.Scanner;

public class Bsp3_Rakete2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objvar=new Scanner(System.in);
		int startzeit=10;
		
		while(startzeit>0) {
			System.out.println(startzeit);
			//bei 5 Sek.
			if (startzeit==5) {
				System.out.println("Ist der Check-up in Ordnung (1=Ja, 0=Nein):");
				int antw=objvar.nextInt();
				if(antw==0) {
					System.out.println("Raketenstart abgebrochen.");
					break;
				} else {
					System.out.println("...Count-Down wird fortgesetzt.");
				}
			}
			// bis hier hin ist alles 5 Sek.
			//bei 1 Sek.
			if(startzeit==1) {
				System.out.println("Rakete startet...");
			}
			startzeit=startzeit-1;
			
		}
		System.out.println("Programmende");
		objvar.close();
	}

}
