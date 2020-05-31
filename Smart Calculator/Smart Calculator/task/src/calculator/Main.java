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
                System.out.println("The program support the addition +  and substraction - operators");
                System.out.println("The even number of minuses gives a plus, and the odd number of minuses gives a minus!");
                continue;
            }

            String[] items = input.split("\\s+");
            for (String item : items) {
                //System.out.println("item: " + item);
            }
            int result = Integer.parseInt(items[0]);
            if (items.length > 1) {
                for (int i = 1; i < items.length; i++) {
                    //System.out.println("items[i]: " + items[i]);
                    //System.out.println("result: " + result);
                    //System.out.println("items[i+1]: " + items[i+1]);
                    switch (items[i]) {
                        case "+" :
                            result = result + Integer.parseInt(items[i+1]);
                            break;
                        case "-" :
                            result = result - Integer.parseInt(items[i+1]);
                            break;
                    }
                    i++;
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
