package org.example;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public String checkout(int amount) {
        return "Checkout with Paypal: $" + amount;
    }
}
