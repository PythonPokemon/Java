package Tag06;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {

    
    public static void main(String[] args) {
        // Erstelle ein JFrame-Objekt (Fenster)
        JFrame fenster = new JFrame("Mein erstes Fenster");

        // Setze die Größe des Fensters
        fenster.setSize(400, 300);

        // Setze das Verhalten beim Schließen des Fensters
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Füge ein JLabel (Textetikett) zum Fenster hinzu
        JLabel label = new JLabel("Hallo, das ist ein einfaches Fenster!");
        fenster.add(label);

        // Stelle sicher, dass das Fenster sichtbar ist
        fenster.setVisible(true);
    }
}
