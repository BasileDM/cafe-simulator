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

}
