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

            String[] items = input.split(" ");
            if (items.length <= 1) {
                System.out.println(Integer.parseInt(items[0]));
            } else {
                System.out.println(Integer.parseInt(items[0]) + Integer.parseInt(items[1]));
            }
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
