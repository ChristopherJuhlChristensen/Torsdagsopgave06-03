import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2.b: Print besked og bed om brugerens navn
        System.out.println("Please type your name");

        // 2.c: Opret en Scanner-objekt for at læse brugerens input
        Scanner scanner = new Scanner(System.in);

        // 2.d: Deklarer en String-variabel til at gemme brugerens navn
        String name = scanner.nextLine();

        // 2.e: Print en hilsen med brugerens navn og bed om deres alder
        System.out.println("Hello " + name);
        System.out.println("Please type your age");

        // 2.f: Deklarer en int-variabel til at gemme brugerens alder
        int age = scanner.nextInt();

        // 2.g: Print brugerens alder
        System.out.println("You are " + age + " years old");

        // 2.h: Beregn antal år til pensionering (forudsæt pensionsalder på 67 år)
        int yearsToRetirement = 67 - age;

        // Print resultatet
        System.out.println("You have " + yearsToRetirement + " years until retirement");

        scanner.close();
    }
}
