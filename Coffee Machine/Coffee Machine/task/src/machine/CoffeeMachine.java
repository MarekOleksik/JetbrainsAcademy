package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static Scanner scanner = new Scanner(System.in);

    private static int water = 1200;
    private static int milk = 540;
    private static int coffee = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void main(String[] args) {

        System.out.println("Write action (buy, fill, take):");
        String answer = scanner.next();

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
        }


        System.out.println("Write how many ml of water the coffee machine has: ");
        int howManyWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int howManyMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int howManyCoffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int howManyCups = scanner.nextInt();

        int result = Integer.MAX_VALUE;
        if (howManyWater / water < result) {
            result = howManyWater / water;
        }
        if (howManyMilk / milk < result) {
            result = howManyMilk / milk;
        }
        if (howManyCoffee / coffee < result) {
            result = howManyCoffee / coffee;
        }

        if (howManyCups == result) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (howManyCups > result) {
            System.out.printf("No, I can make only %d cup(s) of coffee\n", result);
        } else {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)\n", result - howManyCups);
        }


    }

    private static void take() {

    }

    private static void fill() {

    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int kindOfCoffe = scanner.nextInt();
        switch (kindOfCoffe) {
            case 1:
                setWater(getWater() - 250);
                setCoffee(getCoffee() - 16);
                setMoney(getMoney() - 4);
                break;
            case 2:
                setWater(getWater() - 350);
                setMilk(getMilk() - 75);
                setCoffee(getCoffee() - 20);
                setMoney(getMoney() - 7);
                break;
            case 3:
                setWater(getWater() - 200);
                setMilk(getMilk() - 100);
                setCoffee(getCoffee() - 12);
                setMoney(getMoney() - 6);
                break;

        }
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
