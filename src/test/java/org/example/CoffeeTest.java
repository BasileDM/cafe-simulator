package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeTest {
    @Test
    public void testGetPrice() {
        Espresso espresso = new Espresso();
        MilkCoffee milkCoffee = new MilkCoffee();
        assertEquals(CoffeeType.ESPRESSO.getPrice(), espresso.getPrice(), 0.01, "Espresso price should be 2.0");
        assertEquals(CoffeeType.MILK_COFFEE.getPrice(), milkCoffee.getPrice(), 0.01, "Milk Coffee price should be 2.5");
    }

    @Test
    public void testGetDescription() {
        Espresso espresso = new Espresso();
        MilkCoffee milkCoffee = new MilkCoffee();
        assertEquals(CoffeeType.ESPRESSO.getDescription(), espresso.getDescription(), "Should return Espresso");
        assertEquals(CoffeeType.MILK_COFFEE.getDescription(), milkCoffee.getDescription(), "Should return Milk Coffee");
    }
}
