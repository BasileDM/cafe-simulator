package org.example;

public class Espresso implements Coffee {
    private final double price;
    private final String description;

    public Espresso() {
        this.price = CoffeeType.ESPRESSO.getPrice();
        this.description = CoffeeType.ESPRESSO.getDescription();
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
