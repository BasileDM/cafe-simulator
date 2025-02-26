package org.example;

public enum CoffeeType {
    ESPRESSO(2.0, "Espresso"),
    MILK_COFFEE(2.5, "Milk Coffee");

    private final double price;
    private final String description;

    CoffeeType(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
