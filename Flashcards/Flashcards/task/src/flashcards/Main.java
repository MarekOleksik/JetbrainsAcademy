package flashcards;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of cards: ");
        int numberOfCards = Integer.parseInt(scanner.nextLine());
        Map<String, String> map = new TreeMap<>();
        map.clear();
        String term = "";
        String definition = "";

        for (int i = 0; i < numberOfCards; i++) {
            System.out.printf("The card #%s:%n", (i + 1));
            term = scanner.nextLine().toLowerCase();
            while (map.containsKey(term)) {
                System.out.printf("The card \"%s\" already exists. Try again:\n", term);
                term = scanner.nextLine().toLowerCase();
            }
            System.out.printf("The definition of the card #%s:%n", (i + 1));
            definition = scanner.nextLine().toLowerCase();
            while (map.containsValue(definition)) {
                System.out.printf("The definition \"%s\" already exists. Try again:\n", definition);
                definition = scanner.nextLine().toLowerCase();
            }
            map.put(term, definition);
        }

        map.forEach((key, value) -> {
            System.out.printf("Print the definition of \"%s\":%n", key);
            String input = scanner.nextLine().toLowerCase();

            if (value.equals(input)) {
                System.out.printf("Correct answer.%n");
            } else if (map.containsValue(input)) {
                System.out.printf("Wrong answer. The correct one is \"%s\", you've just written the definition of \"%s\".%n", value, getKeyFromValue(map, input));
            } else {
                System.out.printf("Wrong answer. The correct one is \"%s\".%n", value);
            }
        });
    }

    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
}
