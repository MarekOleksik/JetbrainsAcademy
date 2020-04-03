
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] array = new char[input.length()];
        String output = "";
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'a') {
                array[i] = 'b';
            } else {
                array[i] = input.charAt(i);
            }
            output = output + array[i];
        }
        System.out.println(output);
        // put your code here
    }
}