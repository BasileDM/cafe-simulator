package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardStrategyTest {
    @Test
    public void testCheckout() {
        CreditCardStrategy creditCardStrategy = new CreditCardStrategy();
        int amount = 10;
        String result = creditCardStrategy.checkout(amount);
        assertEquals("Checkout with Credit Card: $" + amount, result, "Should return Checkout with Credit Card: $" + amount);
    }
}
