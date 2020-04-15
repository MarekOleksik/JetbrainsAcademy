import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRecords = Integer.parseInt(scanner.next());
        Set<String> knownWords = new HashSet<>();
        for (int i = 0; i < numberOfRecords; i++) {
            knownWords.add(scanner.next().toLowerCase());

        }
        int numberOfLines = Integer.parseInt(scanner.next());
        scanner.nextLine();
        Set<String> inputText = new HashSet<>();
        String[] splittedText = null;

        for (int i = 0; i < numberOfLines; i++) {
            String text = scanner.nextLine().toLowerCase();
            splittedText = text.split(" ");

            for (String text1 : splittedText) {
                inputText.add(text1);
            }
        }
        inputText.removeAll(knownWords);
        inputText.forEach(System.out::println);
        // put your code here
    }
}