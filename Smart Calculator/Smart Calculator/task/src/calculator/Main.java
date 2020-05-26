package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!"/exit".equals(input)) {

            input = scanner.nextLine();
            if (input.isEmpty()) continue;
            if (endProgram(input)) break;
            if ("/help".equals(input)) {
                System.out.println("The program calculates the sum of numbers");
                continue;
            }

            String[] items = input.split(" ");
            int result = 0;
            if (items.length <= 1) {
                result = Integer.parseInt(items[0]);
            } else {
                for (int i = 0; i < items.length; i++) {
                    result += Integer.parseInt(items[i]);
                }
            }
            System.out.println(result);
        }
    }

    private static boolean endProgram(String a) {
        if ("/exit".equals(a)) {
            System.out.println("Bye!");
            return true;
        }
        return false;
    }
}
