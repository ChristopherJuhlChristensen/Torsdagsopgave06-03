import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Opretter en ArrayList med handlinger (menuvalgmuligheder)
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // Opretter et GameMenu objekt med listen af handlinger
        GameMenu gameMenu = new GameMenu(actions);

        // Kalder getAction() for at fange brugerens valg
        String userChoice = gameMenu.getAction();

        // Konverterer brugerens valg fra String til int
        int action = Integer.parseInt(userChoice);

        // Kalder doAction() metoden for at udføre handlingen baseret på brugerens valg
        doAction(action);
    }

    // Metode til at udføre handlingen baseret på brugerens input
    public static void doAction(int action) {
        // Brug af switch-case for at vælge handling baseret på input
        switch (action) {
            case 1:
                System.out.println("Starting the game now");  // Hvis valg 1, start spillet
                break;
            case 2:
                System.out.println("Fetching previously saved game data");  // Hvis valg 2, genoptag spillet
                break;
            case 3:
                System.out.println("Game paused");  // Hvis valg 3, pause spillet
                break;
            case 4:
                System.out.println("Ending game");  // Hvis valg 4, slut spillet
                break;
            default:
                System.out.println("Invalid choice");  // Hvis valg er udenfor de gyldige muligheder
                break;
        }
    }
}
