package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeTest {
    @Test
    public void testGetPrice() {
        Espresso espresso = new Espresso();
        MilkCoffee milkCoffee = new MilkCoffee();
        assertEquals(CoffeeType.ESPRESSO.getPrice(), espresso.getPrice(), "Espresso price should be 2.0");
        assertEquals(CoffeeType.MILK_COFFEE.getPrice(), milkCoffee.getPrice(), 0.01, "Milk Coffee price should be 2.5");
    }

    @Test
    public void testGetDescription() {
        Espresso espresso = new Espresso();
        MilkCoffee milkCoffee = new MilkCoffee();
        assertEquals("Espresso", espresso.getDescription(), "Should return Espresso");
        assertEquals("Milk Coffee", milkCoffee.getDescription(), "Should return Milk Coffee");
    }
}
