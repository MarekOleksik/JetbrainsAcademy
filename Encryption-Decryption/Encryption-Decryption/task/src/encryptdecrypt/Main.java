package encryptdecrypt;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in).useDelimiter("\\s");

    public static void main(String[] args) {

        String method = scanner.nextLine();
        String text = scanner.nextLine();
        int key = Integer.parseInt(scanner.nextLine());
        char[] textToChar = text.toCharArray();

        encrypt(key, textToChar, method);
    }

    private static void encrypt(int key, char[] textToChar, String method) {
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
        System.out.print(String.valueOf(output));
    }

    private static String getUserInput() {
        String answer = scanner.nextLine();
        return answer;
    }
}
