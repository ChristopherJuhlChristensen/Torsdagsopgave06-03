import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;  // Variabel til at gemme det tilfældige nummer

    public static void main(String[] args) {
        // Vælg et tilfældigt tal mellem 1 og 100 (inklusiv)
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("Jeg tænker på et tal mellem 1 og 100 (inklusive begge).");
        System.out.println("Kan du gætte, hvad det er?...");
        makeAGuess();  // Start spillet ved at kalde metoden makeAGuess
    }

    private static void makeAGuess() {
        // Bruger Scanner objekt for at få brugerinput
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast dit gæt: ");

        // Bruger hasNextInt til at tjekke, om input er et tal
        if (scanner.hasNextInt()) { 
            // Læser brugerens input som et heltal
            int userGuess = scanner.nextInt();

            // Sammenligner brugerens gæt med det tilfældige tal
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Udenfor grænserne! Indtast et tal mellem 1 og 100.");
            } else if (userGuess < rnd_number) {
                // Hvis gættet er for lavt, sig at det er for lavt
                System.out.println("For lavt! Prøv igen.");
            } else if (userGuess > rnd_number) {
                // Hvis gættet er for højt, sig at det er for højt
                System.out.println("For højt! Prøv igen.");
            } else {
                // Hvis gættet er korrekt
                System.out.println("Tillykke! Du gættede det rigtige tal.");
                return; // Afslut spillet, da gættet var korrekt
            }
        } else {
            // Hvis input ikke er et tal, vis en fejlmeddelelse
            System.out.println("Ugyldigt input! Indtast et tal.");
            scanner.next(); // Ryd det forkerte input
        }

        // Lad brugeren prøve igen ved at kalde metoden rekursivt
        makeAGuess();
    }
}
