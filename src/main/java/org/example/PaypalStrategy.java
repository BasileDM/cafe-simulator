package org.example;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public String checkout(double amount) {
        return "Checkout with Paypal: $" + amount;
    }
}
