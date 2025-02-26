package org.example;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public String checkout(double amount) {
        return "Checkout with Credit Card: $" + amount;
    }
}
