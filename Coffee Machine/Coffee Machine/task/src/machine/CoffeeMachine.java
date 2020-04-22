

package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        String answer = "";

        while (!answer.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            answer = scanner.next();

            switch (answer) {
                case "buy":
                    coffee.buy();
                    break;
                case "fill":
                    coffee.fill();
                    break;
                case "take":
                    coffee.take();
                    break;
                case "remaining":
                    coffee.stateOfMachine();
                    break;
            }
        }
    }
}
