package encryptdecrypt;

public interface Algorithms {
    String enc(int key, char[] textToChar);
    String dec(int key, char[] textToChar);

}