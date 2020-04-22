

package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static Scanner scanner = new Scanner(System.in);

    private static int water = 400;
    private static int milk = 540;
    private static int coffee = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void main(String[] args) {

        action();
    }

    private static void action() {
        String answer = "";

        while (!answer.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            answer = scanner.next();

            switch (answer) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    stateOfMachine();
                    break;
            }
        }
    }

    private static void stateOfMachine() {
        System.out.println();
        System.out.println("The coffee machine has: ");
        System.out.printf("%d of water \n", water);
        System.out.printf("%d of milk \n", milk);
        System.out.printf("%d of coffee beans \n", coffee);
        System.out.printf("%d of disposable cups \n", cups);
        System.out.printf("$%d of money \n", money);
        System.out.println();
    }

    private static void take() {
        System.out.println();
        System.out.printf("I gave you $%d\n", getMoney());
        setMoney(0);
        System.out.println();
    }

    private static void fill() {
        System.out.println();
        System.out.println("Write how many ml of water do you want to add:");
        setWater(getWater() + scanner.nextInt());
        System.out.println("Write how many ml of milk do you want to add");
        setMilk(getMilk() + scanner.nextInt());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        setCoffee(getCoffee() + scanner.nextInt());
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        setCups(getCups() + scanner.nextInt());
        System.out.println();
    }

    private static void buy() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String kindOfCoffee = scanner.next();
        switch (kindOfCoffee) {
            case "1":
                buyCoffee(250, 0, 16, 1, 4);
                break;
            case "2":
                buyCoffee(350, 75, 20, 1, 7);
                break;
            case "3":
                buyCoffee(200, 100, 12, 1, 6);
                break;
            case "back":
                break;

        }
        System.out.println();
    }

    private static void buyCoffee(int waterNeeded, int milkNeeded, int coffeeNeeded, int cupsNeeded, int cost) {
        int temp = getWater();
        setWater(getWater() - waterNeeded);
        if (getWater() < 0) {
            System.out.println("Sorry, not enough water!");
            setWater(temp);
            return;
        }
        temp = getMilk();
        setMilk(getMilk() - milkNeeded);
        if (getMilk() < 0) {
            System.out.println("Sorry, not enough milk!");
            setMilk(temp);
            return;
        }
        temp = getCoffee();
        setCoffee(getCoffee() - coffeeNeeded);
        if (getCoffee() < 0) {
            System.out.println("Sorry, not enough coffee beans!");
            setCoffee(temp);
            return;
        }
        temp = getCups();
        setCups(getCups() - cupsNeeded);
        if (getCups() < 0) {
            System.out.println("Sorry, not enough disposable cups!");
            setCups(temp);
            return;
        }
        setMoney(getMoney() + cost);
        System.out.println("I have enough resources, making you a coffee!");
    }

    public static int getWater() {
        return water;
    }

    public static void setWater(int water) {
        CoffeeMachine.water = water;
    }

    public static int getMilk() {
        return milk;
    }

    public static void setMilk(int milk) {
        CoffeeMachine.milk = milk;
    }

    public static int getCoffee() {
        return coffee;
    }

    public static void setCoffee(int coffee) {
        CoffeeMachine.coffee = coffee;
    }

    public static int getCups() {
        return cups;
    }

    public static void setCups(int cups) {
        CoffeeMachine.cups = cups;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        CoffeeMachine.money = money;
    }
}
