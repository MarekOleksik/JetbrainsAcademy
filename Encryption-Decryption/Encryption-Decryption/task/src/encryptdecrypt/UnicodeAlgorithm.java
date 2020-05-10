package encryptdecrypt;

public class UnicodeAlgorithm {


    public static String enc(int key, char[] textToChar) {
        char[] output = new char[textToChar.length];
        int charNumber = 0;

        for (int i = 0; i < textToChar.length; i++) {
            charNumber = textToChar[i];
            output[i] = (char) (charNumber + key);
        }
        return String.valueOf(output);
    }

    public static String dec(int key, char[] textToChar) {

        char[] output = new char[textToChar.length];
        int charNumber = 0;

        for (int i = 0; i < textToChar.length; i++) {
            charNumber = textToChar[i];
            output[i] = (char) (charNumber - key);
        }
        return String.valueOf(output);
    }
}
