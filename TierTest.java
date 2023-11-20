// Die Hauptklasse für den Test
public class TierTest {
    public static void main(String[] args) {
        // Erstelle Instanzen von Löwe und Elefant
        Löwe löwe = new Löwe("Simba");
        Elefant elefant = new Elefant("Dumbo");

        // Gib Aktionen der Tiere auf der Konsole aus
        System.out.println("Aktionen des Löwen:");
        löwe.essen();     // Löwe isst
        löwe.schlafen();  // Löwe schläft
        löwe.brüllen();   // Löwe brüllt laut
        löwe.jagen();

        System.out.println("\nAktionen des Elefanten:");
        elefant.essen();      // Elefant isst
        elefant.schlafen();   // Elefant schläft
        elefant.trompeten();  // Elefant trompetet
    }
}

// -------------------------------Tier------------------------------------------
class Tier {
    // Instanzvariable für den Namen des Tiers
    String name;

    // Konstruktor für die Tierklasse
    public Tier(String name) {
        // Initialisiere den Namen des Tiers mit dem übergebenen Wert
        this.name = name;
    }

    // Methode, um anzuzeigen, dass das Tier isst
    public void essen() {
        System.out.println(name + " isst.");
    }

    // Methode, um anzuzeigen, dass das Tier schläft
    public void schlafen() {
        System.out.println(name + " schläft.");
    }

    public void jagen(){
        System.out.println(name + " jagt.");
    }
}

// -----------------------------Löwe--------------------------------------------
class Löwe extends Tier {
    // Konstruktor für die Löwenklasse
    public Löwe(String name) {
        // Aufruf des Konstruktors der Elternklasse (Tier) mit dem übergebenen Namen
        super(name);
    }

    // Spezifische Methode für den Löwen, um anzuzeigen, dass er brüllt
    public void brüllen() {
        System.out.println(name + " brüllt laut.");
    }
}

// ---------------------------Elefant------------------------------------------
class Elefant extends Tier {
    // Konstruktor für die Elefantenklasse
    public Elefant(String name) {
        // Aufruf des Konstruktors der Elternklasse (Tier) mit dem übergebenen Namen
        super(name);
    }

    // Spezifische Methode für den Elefanten, um anzuzeigen, dass er trompetet
    public void trompeten() {
        System.out.println(name + " trompetet.");
    }
}
