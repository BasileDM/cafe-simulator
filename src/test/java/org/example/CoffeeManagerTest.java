package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoffeeManagerTest {
    @Test
    public void testUniqueInstance() {
        CoffeeManager coffeeManager1 = CoffeeManager.getInstance();
        CoffeeManager coffeeManager2 = CoffeeManager.getInstance();
        assertSame(coffeeManager1, coffeeManager2, "Instances should be the same");
    }

    @Test
    public void testNotNullInstance() {
        CoffeeManager coffeeManager = CoffeeManager.getInstance();
        assertNotEquals(null, coffeeManager, "Instance should not be null");
    }

    @Test
    public void testCreateCoffee() {
        CoffeeManager coffeeManager = CoffeeManager.getInstance();

        // Try with enum
        for (CoffeeType type : CoffeeType.values()) {
            Coffee coffee = coffeeManager.createCoffee(type);
            assertNotNull(coffee, "Coffee should not be null");
            assertEquals(type.name(), coffee.getDescription(), "Should return " + type.name());
        }

        // Without enum
        Coffee espresso = coffeeManager.createCoffee(CoffeeType.ESPRESSO);
        Coffee milkCoffee = coffeeManager.createCoffee(CoffeeType.MILK_COFFEE);

        // Test coffee not null
        assertNotNull(espresso, "Espresso should not be null");
        assertNotNull(milkCoffee, "Milk Coffee should not be null");

        // Test description
        assertEquals("Espresso", espresso.getDescription(), "Should return Espresso");
        assertEquals("Milk Coffee", milkCoffee.getDescription(), "Should return Milk Coffee");

        // Check prices
        assertEquals(2.0, espresso.getPrice(), 0.01, "Espresso price should be 2.0");
        assertEquals(2.5, milkCoffee.getPrice(), 0.01, "Milk Coffee price should be 2.5");
    }

}
