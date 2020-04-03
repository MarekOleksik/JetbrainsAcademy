import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        String text = String.valueOf(ch);
        return (text.equalsIgnoreCase("a") || text.equalsIgnoreCase("e")
                || text.equalsIgnoreCase("i") || text.equalsIgnoreCase("o")
                || text.equalsIgnoreCase("u"));
        // write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}