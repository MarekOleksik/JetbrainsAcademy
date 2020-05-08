package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in).useDelimiter("\\s");
    private static boolean isExport = false;
    private static String exportFileName = "";

    public static void main(String[] args) throws IOException {

        String method = "enc";
        String text = "";
        int key = 0;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                method = args[i + 1];
            }
            if (args[i].equals("-data")) {
                text = args[i + 1];
            } else if (args[i].equals("-in")) {
                text = importFromFile(args[i + 1]);
            }
            if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i + 1]);
            }
            if (args[i].equals("-out")) {
                isExport = true;
                exportFileName = args[i + 1];
            }
        }

        char[] textToChar = text.toCharArray();
        String result = encrypt(key, textToChar, method);
        System.out.println(result);

        if (isExport) {
            exportToFile(exportFileName, result);
        }

    }

    private static String importFromFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        String temp = "";
        if (!file.exists()) {
            System.out.println("File not found.");
        } else {
            Scanner scanFile = new Scanner(new File(filePath));
            while (scanFile.hasNext()) {
                temp = scanFile.nextLine();
            }
        }
        return temp;
    }

    private static void exportToFile(String filePath, String text) throws IOException {
        PrintWriter printWriter = new PrintWriter(filePath);
        printWriter.println(text);
    }

    private static String encrypt(int key, char[] textToChar, String method) {
        char[] output = new char[textToChar.length];
        int charNumber = 0;

        for (int i = 0; i < textToChar.length; i++) {
            charNumber = textToChar[i];
            if ("enc".equals(method)) {
                output[i] = (char) (charNumber + key);
            } else if ("dec".equals(method)) {
                output[i] = (char) (charNumber - key);
            }
        }
        return String.valueOf(output);
    }

    private static String getUserInput() {
        String answer = scanner.nextLine();
        return answer;
    }
}
