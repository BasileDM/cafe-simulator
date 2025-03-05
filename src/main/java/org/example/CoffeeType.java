package org.example;

public enum CoffeeType {
    ESPRESSO(200, "Espresso"),
    MILK_COFFEE(300, "Milk Coffee");

    private final int price;
    private final String description;

    CoffeeType(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
