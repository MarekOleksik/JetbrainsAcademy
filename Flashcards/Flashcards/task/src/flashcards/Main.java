package flashcards;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of cards: ");
        int numberOfCards = Integer.parseInt(scanner.nextLine());
        String[] terms = new String[numberOfCards];
        String[] definitions = new String[numberOfCards];

        for (int i = 0; i < numberOfCards; i++) {
            System.out.printf("The card #%s:%n", (i + 1));
            terms[i] = scanner.nextLine();
            System.out.printf("The definition of the card #%s:%n", (i + 1));
            definitions[i] = scanner.nextLine();
        }

        for (int i = 0; i < definitions.length; i++) {
            System.out.printf("Print the definition of \"%s\":%n", terms[i]);

            if (scanner.nextLine().equalsIgnoreCase(definitions[i])) {
                System.out.printf("Correct answer.%n");
            } else {
                System.out.printf("Wrong answer. The correct one is \"%s\".%n", definitions[i]);
            }
        }

    }
}
