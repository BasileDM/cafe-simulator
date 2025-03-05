package org.example;

public class CoffeeFactory {
    public static Coffee createCoffee(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case CoffeeType.ESPRESSO -> new Espresso();
            case CoffeeType.MILK_COFFEE -> new MilkCoffee();
            default -> throw new IllegalArgumentException("Invalid coffee type: " + coffeeType);
        };
    }
}
