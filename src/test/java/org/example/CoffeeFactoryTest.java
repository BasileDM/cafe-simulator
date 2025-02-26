package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CoffeeFactoryTest {
    @Test
    public void testCreateCoffeeReturn() {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        for (CoffeeType type : CoffeeType.values()) {
            Coffee coffee = coffeeFactory.createCoffee(type);
            assertNotNull(coffee, "Coffee should not be null");
            assertEquals(type.name(), coffee.getDescription(), "Should return " + type.name());
        }
    }
}
