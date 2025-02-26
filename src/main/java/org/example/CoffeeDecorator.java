package org.example;

public abstract class CoffeeDecorator {
    protected Coffee wrappedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    public double getPrice() {
        return wrappedCoffee.getPrice();
    }

    public String getDescription() {
        return wrappedCoffee.getDescription();
    }
}
