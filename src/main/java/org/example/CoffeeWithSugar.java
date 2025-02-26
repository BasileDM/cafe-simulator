package org.example;

public class CoffeeWithSugar extends CoffeeDecorator {
    final static double additionalPrice = 0.5;
    final static String additionalDescription = " with sugar";

    public CoffeeWithSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + additionalPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + additionalDescription;
    }
}
