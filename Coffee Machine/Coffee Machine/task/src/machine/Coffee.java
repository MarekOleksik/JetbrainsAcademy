package machine;

import java.util.Scanner;

public class Coffee {
    private Scanner scanner = new Scanner(System.in);

    private int water = 400;
    private int milk = 540;
    private int coffee = 120;
    private int cups = 9;
    private int money = 550;

    protected void stateOfMachine() {
        System.out.println();
        System.out.println("The coffee machine has: ");
        System.out.printf("%d of water \n", water);
        System.out.printf("%d of milk \n", milk);
        System.out.printf("%d of coffee beans \n", coffee);
        System.out.printf("%d of disposable cups \n", cups);
        System.out.printf("$%d of money \n", money);
        System.out.println();
    }

    protected void take() {
        System.out.println();
        System.out.printf("I gave you $%d\n", getMoney());
        setMoney(0);
        System.out.println();
    }

    protected void fill() {
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

    protected void buy() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String kindOfCoffee = scanner.next();
        switch (kindOfCoffee) {
            case "1":
                buyCoffee(Beverages.ESPRESSO);
                break;
            case "2":
                buyCoffee(Beverages.LATTE);
                break;
            case "3":
                buyCoffee(Beverages.CAPPUCCINO);
                break;
            case "back":
                break;

        }
        System.out.println();
    }

    private void buyCoffee(Beverages beverage) {
        int temp = getWater();
        setWater(getWater() - beverage.getWater());
        if (getWater() < 0) {
            System.out.println("Sorry, not enough water!");
            setWater(temp);
            return;
        }
        temp = getMilk();
        setMilk(getMilk() - beverage.getMilk());
        if (getMilk() < 0) {
            System.out.println("Sorry, not enough milk!");
            setMilk(temp);
            return;
        }
        temp = getCoffee();
        setCoffee(getCoffee() - beverage.getCoffee());
        if (getCoffee() < 0) {
            System.out.println("Sorry, not enough coffee beans!");
            setCoffee(temp);
            return;
        }
        temp = getCups();
        setCups(getCups() - beverage.getCups());
        if (getCups() < 0) {
            System.out.println("Sorry, not enough disposable cups!");
            setCups(temp);
            return;
        }
        setMoney(getMoney() + beverage.getCost());
        System.out.println("I have enough resources, making you a coffee!");
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
