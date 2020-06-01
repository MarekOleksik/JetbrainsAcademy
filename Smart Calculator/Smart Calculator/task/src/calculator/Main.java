package calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!"/exit".equals(input)) {
            try {
                input = scanner.nextLine();
                if (input.isEmpty()) continue;
                if (endProgram(input)) break;
                if ("/help".equals(input)) {
                    System.out.println("The program calculates the sum of numbers");
                    System.out.println("The program support the addition +  and substraction - operators");
                    System.out.println("The even number of minuses gives a plus, and the odd number of minuses gives a minus!");
                    continue;
                }
                String inputReplaced = input.replaceAll("\\s+", " ").replaceAll("\\+\\+\\+", "+")
                        .replaceAll("\\+\\+", "+").replaceAll("---", "-")
                        .replaceAll("--", "+");
                Pattern pattern = Pattern.compile("\\/.*");
                Matcher matcher = pattern.matcher(inputReplaced);
                if (matcher.matches()) {
                    System.out.println("Unknown command");
                    continue;
                }
                String[] items = inputReplaced.split("\\s+");
                for (String item : items) {
                    //System.out.println("item: " + item);
                }
                String result = String.valueOf(Integer.parseInt(items[0]));
                if (items.length > 1) {
                    for (int i = 1; i < items.length; i++) {
                        // System.out.println("items[i]: " + items[i]);
                        //System.out.println("result: " + result);
                        //System.out.println("items[i+1]: " + items[i+1]);
                        switch (items[i]) {
                            case "+":
                                result = String.valueOf(Integer.parseInt(result) + Integer.parseInt(items[i + 1]));
                                break;
                            case "-":
                                result = String.valueOf(Integer.parseInt(result) - Integer.parseInt(items[i + 1]));
                                break;
                            default:
                                result = "Invalid expression";
                                break;

                        }
                        i++;
                    }
                }
                System.out.println(result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid expression");
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
