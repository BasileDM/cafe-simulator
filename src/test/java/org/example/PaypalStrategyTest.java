package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaypalStrategyTest {
    @Test
    public void testCheckout() {
        PaypalStrategy paypalStrategy = new PaypalStrategy();
        int amount = 10;
        String result = paypalStrategy.checkout();
        assertEquals("Transaction paypal effectuée avec succès.", result, "Should return Checkout with Paypal: $10.0");
    }
}
