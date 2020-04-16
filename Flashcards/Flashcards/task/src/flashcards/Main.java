package flashcards;

import java.io.*;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, String> map = new TreeMap<>();
    private static String term = "";
    private static String definition = "";
    private static String filePath = "";


    public static void main(String[] args) throws InterruptedException, IOException {
        String answer = "";

        while (!"exit".equals(answer)) {
            System.out.println("Input the action (add, remove, import, export, ask, exit):");
            answer = scanner.next();
            switch (answer) {
                case "add":
                    add();
                    break;
                case "remove":
                    remove();
                    break;
                case "import":
                    importFile();
                    break;
                case "export":
                    export();
                    break;
                case "ask":
                    ask();
                    break;
                case "map":
                    map.forEach((key, value) -> System.out.println(key + " : " + value));
                    break;
                case "exit":
                    System.out.println("Bye bye!");
                    return;
            }
        }
    }

    private static void add() {
        System.out.printf("The card:%n");
        scanner.skip("\\R");
        term = scanner.nextLine();
        while (map.containsKey(term)) {
            System.out.printf("The card \"%s\" already exists.\n", term);
            System.out.println();
            return;
        }
        System.out.printf("The definition of the card:%n");
        definition = scanner.nextLine();
        while (map.containsValue(definition)) {
            System.out.printf("The definition \"%s\" already exists.\n", definition);
            System.out.println();
            return;
        }
        map.put(term, definition);
        System.out.printf("The pair(\"%s\":\"%s\") has been added.%n", term, definition);
        System.out.println();
    }

    private static void remove() {
        scanner.skip("\\R");
        System.out.printf("The card:%n");
        term = scanner.nextLine();
        if (map.containsKey(term)) {
            map.remove(term);
            System.out.println("The card has been removed");
        } else {
            System.out.printf("Can't remove \"%s\": there is no such card.%n", term);
        }
        System.out.println();
    }

    private static void importFile() throws FileNotFoundException {
        scanner.skip("\\R");
        System.out.printf("File name:%n");
        filePath = scanner.nextLine();
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.printf("File not found.%n");
        } else {
            Scanner scanFile = new Scanner(new File(filePath));

            int counter = 0;
            while (scanFile.hasNext()) {
                term = scanFile.next();
                counter++;
                definition = scanFile.next();
                map.put(term, definition);
            }
            System.out.println(counter + " cards have been loaded.");
        }
        System.out.println();
    }

    private static void export() throws IOException {
        scanner.skip("\\R");
        System.out.printf("File name:%n");
        filePath = scanner.nextLine();
        FileWriter writer = new FileWriter(new File(filePath));
        PrintWriter printWriter = new PrintWriter(writer);
        map.forEach((key, value) -> {
            printWriter.println(key);
            printWriter.println(value);
        });
        System.out.printf("%d cards have been saved.%n", map.size());
        System.out.println();
        printWriter.close();
    }

    private static void ask() {
        System.out.printf("How many times to ask?%n");
        int numberOfAsks = Integer.parseInt(scanner.next());

        Random generator = new Random();
        Object[] values = map.values().toArray();
        String randomValue = (String) values[generator.nextInt(values.length)];

        String key = (String) getKeyFromValue(map, randomValue);
        String value = map.get(key);

        for (int i = 0; i < numberOfAsks; i++) {
            System.out.printf("Print the definition of \"%s\":%n", key);
            String input = scanner.next();

            if (value.equals(input)) {
                System.out.printf("Correct answer.%n");
            } else if (map.containsValue(input)) {
                System.out.printf("Wrong answer. The correct one is \"%s\", you've just written the definition of \"%s\".%n", value, getKeyFromValue(map, input));
            } else {
                System.out.printf("Wrong answer. The correct one is \"%s\".%n", value);
            }
        }
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
