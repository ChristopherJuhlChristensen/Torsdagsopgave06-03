import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
    private ArrayList<String> actions; // Liste over handlinger (menuvalgmuligheder)

    // Konstruktor til at initialisere handlinger med en liste af handlinger
    public GameMenu(ArrayList<String> actions) {
        this.actions = actions; // Initialiserer actions med den liste, der bliver sendt som parameter
    }

    // Metode til at vise menuen
    public void displayMenu() {
        for (String action : actions) { // Går igennem listen af handlinger
            System.out.println(action); // Printer hver handling (menuvalgmulighed)
        }
    }

    // Metode til at få brugerens valg af handling
    public String getAction() {
        System.out.println("Skriv et nummer for at vælge en handling:"); 
        displayMenu();  // Genbruger displayMenu for at vise valgmulighederne

        // Opretter et Scanner objekt for at fange brugerens input
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine(); // Fanger brugerens input som en streng

        return choice; // Returnerer brugerens valg som en streng
    }
}
