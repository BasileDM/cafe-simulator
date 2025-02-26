package org.example;

public class MilkCoffee implements Coffee {
    private final double price;
    private final String description;

    public MilkCoffee() {
        this.price = CoffeeType.MILK_COFFEE.getPrice();
        this.description = CoffeeType.MILK_COFFEE.getDescription();
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
