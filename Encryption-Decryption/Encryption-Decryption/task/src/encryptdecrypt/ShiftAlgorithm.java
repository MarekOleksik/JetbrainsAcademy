package encryptdecrypt;

public class ShiftAlgorithm implements Algorithms{
    public String enc(int key, char[] textToChar) {
        char[] output = new char[textToChar.length];
        int charNumber = 0;

        for (int i = 0; i < textToChar.length; i++) {
            //charNumber = textToChar[i];
           // output[i] = (char) (charNumber + key);
        }
        return String.valueOf(output);
    }

    public String dec(int key, char[] textToChar) {

        char[] output = new char[textToChar.length];
        int charNumber = 0;

        for (int i = 0; i < textToChar.length; i++) {
            //charNumber = textToChar[i];
            //output[i] = (char) (charNumber - key);
        }
        return String.valueOf(output);
    }
}
