package machine;

public enum Beverages {
    ESPRESSO(250, 0, 16, 1, 4),
    LATTE(350, 75, 20, 1, 7),
    CAPPUCCINO(200, 100, 12, 1, 6);

    private final int water;
    private final int milk;
    private final int coffee;
    private final int cups;
    private final int cost;

    Beverages(int water, int milk, int coffee, int cups, int cost) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cups = cups;
        this.cost = cost;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public int getCups() {
        return cups;
    }

    public int getCost() {
        return cost;
    }
}
