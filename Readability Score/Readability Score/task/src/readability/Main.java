package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String text = importFromFile(args[0]);
        String[] stringsOfText = text.split("[.!?]+");
        String[] words;
        char[] character = text.toCharArray();
        List<Character> characters = new ArrayList<>();
        for (char ch : character) {
            if (ch != ' ') {
                characters.add(ch);
            }
        }
        List<String> listOfWords = new ArrayList<>();
        for (String item : stringsOfText) {
            words = item.split("[^\\w,]");
            for (String t : words) {
                if (!t.isEmpty()) {
                    listOfWords.add(t);
                }
            }
        }

        double score = getScore(characters.size(), listOfWords.size(), stringsOfText.length);

        System.out.println("The text is: \n" + text);
        System.out.println();
        System.out.println("Words: " + listOfWords.size());
        System.out.println("Sentences: " + stringsOfText.length);
        System.out.println("Characters: " + characters.size());
        System.out.printf("The score is: %.2f\n", score);
        System.out.printf("This text should be understood by %s year olds.\n", getAge(score));
    }

    private static String importFromFile(String filePath) throws IOException {
        File file = new File(filePath);
        String output = "";
        if (!file.exists()) {
            System.out.println("File not found.");
        } else {
            Scanner scanFile = new Scanner(new File(filePath));
            while (scanFile.hasNext()) {
                output = scanFile.nextLine();
            }
            scanFile.close();
        }

        return output;
    }

    private static double getScore(double characters, double words, double sentences) {
        return 4.71 * (characters / words) + 0.5 * (words / sentences) - 21.43;
    }

    private static String getAge(double score) {
        switch ((int) Math.ceil(score)) {
            case 1:
                return "5-6";
            case 2:
                return "6-7";
            case 3:
                return "7-9";
            case 4:
                return "9-10";
            case 5:
                return "10-11";
            case 6:
                return "11-12";
            case 7:
                return "12-13";
            case 8:
                return "13-14";
            case 9:
                return "14-15";
            case 10:
                return "15-16";
            case 11:
                return "16-17";
            case 12:
                return "17-18";
            case 13:
                return "18-24";
            case 14:
                return "24+";
            default:
                return "";
        }
    }
}
