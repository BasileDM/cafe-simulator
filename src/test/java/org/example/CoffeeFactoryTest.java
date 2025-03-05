package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoffeeFactoryTest {
    @Test
    public void testCreateCoffeeReturn() {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        for (CoffeeType type : CoffeeType.values()) {
            Coffee coffee = coffeeFactory.createCoffee(type);
            assertNotNull(coffee, "Coffee should not be null");
            assertEquals(type.getDescription(), coffee.getDescription(), "Should return " + type.getDescription());
            // Check instance of depending on enum value
            if (type == CoffeeType.ESPRESSO) {
                assertInstanceOf(Espresso.class, coffee);
            } else if (type == CoffeeType.MILK_COFFEE) {
                assertInstanceOf(MilkCoffee.class, coffee);
            } else {
                fail("Invalid coffee type: " + type);
            }
        }
    }
}
