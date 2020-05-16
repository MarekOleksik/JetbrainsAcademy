package encryptdecrypt;

public class ShiftAlgorithm implements Algorithms {

    @Override
    public String enc(int key, char[] textToChar) {
        char[] output = new char[textToChar.length];
        int charNumber = 0;

        for (int i = 0; i < textToChar.length; i++) {
            charNumber = textToChar[i];
            if (charNumber >= 65 && charNumber <= 90) {
                output[i] = (char) (65 + (charNumber - 65 + key) % 26);
            } else if (charNumber >= 97 && charNumber <= 122) {
                output[i] = (char) (97 + (charNumber - 97 + key) % 26);
            } else {
                output[i] = (char) charNumber;
            }
        }

        return String.valueOf(output);
    }

    @Override
    public String dec(int key, char[] textToChar) {

        return enc(26 - (key % 26), textToChar);
    }
}