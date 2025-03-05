package org.example;

public class CoffeeWithSugar extends CoffeeDecorator {
    final static int additionalPrice = 50;
    final static String additionalDescription = " with sugar";

    public CoffeeWithSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + additionalPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + additionalDescription;
    }
}
