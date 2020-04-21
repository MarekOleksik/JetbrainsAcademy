package flashcards;

import java.io.*;
import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, String> map = new TreeMap<>();
    private static String term = "";
    private static String definition = "";
    private static String filePath = "";
    private static List<String> logList = new LinkedList<>();
    private static Map<String, Integer> hardestCardMap = new TreeMap<>();
    private static int hardestCard = 0;
    private static String keyHardestCard = "";
    private static List<String> listHardestCards = new LinkedList<>();


    public static void main(String[] args) throws InterruptedException, IOException {
        if (args.length == 0 || (args.length == 2 && args[0].equals("-export"))) {
            runProgram(args);
        } else {
            importOnStart(args);
        }
    }

    private static void importOnStart(String[] args) throws IOException {
        if (args.length == 2 && args[0].equals("-import")) {
            filePath = args[1];
            importFile(filePath);
            runProgram(args);
        } else if (args.length == 4 && args[0].equals("-import")) {
            filePath = args[1];
            importFile(filePath);
            runProgram(args);
        } else if (args.length == 4 && args[2].equals("-import")) {
            filePath = args[3];
            importFile(filePath);
            runProgram(args);
        }
    }

    private static void runProgram(String[] args) throws IOException {
        String answer = "";

        while (!"exit".equals(answer)) {
            outputMsg("Input the action (add, remove, import, export, ask, exit, log, hardest card, reset stats):");
            // scanner.skip("\\R");
            answer = getUserInput();
            switch (answer) {
                case "add":
                    add();
                    break;
                case "remove":
                    remove();
                    break;
                case "import":
                    filePath = getFileName();
                    importFile(filePath);
                    break;
                case "export":
                    filePath = getFileName();
                    export(filePath);
                    break;
                case "ask":
                    ask();
                    break;
                case "map":
                    map.forEach((key, value) -> outputMsg(key + " : " + value));
                    hardestCardMap.forEach((key, value) -> System.out.println("hardest card: " + key + ":" + value));
                    listHardestCards.forEach(System.out::println);
                    break;
                case "exit":
                    outputMsg("Bye bye!");
                    exportOnExit(args);
                    break;
                case "log":
                    log();
                    break;
                case "hardest card":
                    hardestCard();
                    break;
                case "reset stats":
                    resetStats();
                    break;

            }
        }
    }

    private static void exportOnExit(String[] args) throws IOException {
        if (args.length == 2 && args[0].equals("-export")) {
            filePath = args[1];
            export(filePath);
        } else if (args.length == 4 && args[0].equals("-export")) {
            filePath = args[1];
            export(filePath);
        } else if (args.length == 4 && args[2].equals("-export")) {
            filePath = args[3];
            export(filePath);
        }
    }


    private static void hardestCard() {

        hardestCard = 0;
        hardestCardMap.forEach((key, value) -> {
            if (value > hardestCard) {
                listHardestCards.remove(keyHardestCard);
                hardestCard = value;
                keyHardestCard = key;
                listHardestCards.add(keyHardestCard);
            } else if (value == hardestCard && value != 0) {
                hardestCard = value;
                keyHardestCard = key;
                listHardestCards.add(keyHardestCard);
            }

        });

        if (hardestCard == 0) {
            outputMsg("There are no cards with errors.");
        } else if (listHardestCards.size() == 1) {
            outputMsg("The hardest card is \"" + keyHardestCard + "\". You have " + hardestCard + " errors answering it.");
        } else if (listHardestCards.size() > 1) {
            String result = "\"" + listHardestCards.get(0) + "\"";
            for (int i = 1; i < listHardestCards.size(); i++) {
                result = result + ", \"" + listHardestCards.get(i) + "\"";
                System.out.println(result);
            }
            outputMsg("The hardest card is \"" + result + "\" with " + hardestCard + " mistakes.");
        }
    }

    private static void resetStats() {
        hardestCardMap.forEach((key, value) -> {
            hardestCardMap.put(key, 0);
        });
        listHardestCards.clear();
        outputMsg("Card statistics has been reset.");
    }

    private static void log() throws FileNotFoundException {
        getFileName();
        PrintWriter printWriter = new PrintWriter(filePath);
        for (String item : logList) {
            printWriter.println(item);
        }
        printWriter.flush();
        outputMsg("The log have been saved");

    }

    private static void add() {
        outputMsg("The card:");
        term = getUserInput();
        while (map.containsKey(term)) {
            outputMsg("The card \"" + term + "\" already exists.");
            System.out.println();
            return;
        }
        outputMsg("The definition of the card:");
        definition = getUserInput();
        while (map.containsValue(definition)) {
            outputMsg("The definition \"" + definition + "\" already exists.");
            System.out.println();
            return;
        }
        map.put(term, definition);
        hardestCardMap.put(term, 0);

        outputMsg("The pair(\"" + term + "\":\"" + definition + "\") has been added.");
        System.out.println();
    }

    private static void remove() {
        outputMsg("The card:");
        term = getUserInput();
        if (map.containsKey(term)) {
            map.remove(term);
            hardestCardMap.remove(term);
            outputMsg("The card has been removed");
        } else {
            outputMsg("Can't remove \"" + term + "\": there is no such card.");
        }
        System.out.println();
    }


    private static void importFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (!file.exists()) {
            outputMsg("File not found.");
        } else {
            Scanner scanFile = new Scanner(new File(filePath));

            int counter = 0;
            while (scanFile.hasNext()) {
                term = scanFile.next();
                counter++;
                definition = scanFile.next();
                hardestCard = Integer.parseInt(scanFile.next());
                map.put(term, definition);
                hardestCardMap.put(term, hardestCard);
            }

            outputMsg(counter + " cards have been loaded");
        }
        System.out.println();
    }

    private static void export(String filePath) throws IOException {
        PrintWriter printWriter = new PrintWriter(filePath);
        map.forEach((key, value) -> {
            printWriter.println(key);
            printWriter.println(value);
            printWriter.println(hardestCardMap.get(key));
            printWriter.flush();
        });
        outputMsg(map.size() + " cards have been saved.");
        System.out.println();

    }

    private static String getFileName() {
        outputMsg("File name:");
        filePath = getUserInput();
        return filePath;
    }

    private static void ask() {
        outputMsg("How many times to ask?");
        int numberOfAsks = Integer.parseInt(getUserInput());

        List<String> keysAsArray = new ArrayList<>(map.keySet());
        Random r = new Random();
        String randomValue = map.get(keysAsArray.get(r.nextInt(keysAsArray.size())));
        String key = (String) getKeyFromValue(map, randomValue);
        String value = map.get(key);

        for (int i = 0; i < numberOfAsks; i++) {
            outputMsg("Print the definition of \"" + key + "\": ");
            String input = getUserInput();

            if (value.equals(input)) {
                outputMsg("Correct answer.");
            } else if (map.containsValue(input)) {
                outputMsg("Wrong answer. The correct one is \"" + value + "\", you've just written the definition of \"" + getKeyFromValue(map, input) + "\".");
                hardestCard = hardestCardMap.get(key) + 1;
                hardestCardMap.put(key, hardestCard);
            } else {
                outputMsg("Wrong answer. The correct one is \"" + value + "\".");
                hardestCard = hardestCardMap.get(key) + 1;
                hardestCardMap.put(key, hardestCard);
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

    private static void outputMsg(String msg) {
        System.out.println(msg);
        logList.add(msg);
    }

    private static String getUserInput() {
        String answer = scanner.nextLine();
        logList.add(answer);
        return answer;
    }
}
