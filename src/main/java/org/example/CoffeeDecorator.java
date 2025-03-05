package org.example;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee wrappedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    public int getPrice() {
        return wrappedCoffee.getPrice();
    }

    public String getDescription() {
        return wrappedCoffee.getDescription();
    }
}
