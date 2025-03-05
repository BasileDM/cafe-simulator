package org.example;

public class Espresso implements Coffee {
    private final int price;
    private final String description;

    public Espresso() {
        this.price = CoffeeType.ESPRESSO.getPrice();
        this.description = CoffeeType.ESPRESSO.getDescription();
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
