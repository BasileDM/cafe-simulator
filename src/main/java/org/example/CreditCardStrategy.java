package org.example;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public String checkout(int amount) {
        return "Checkout with Credit Card: $" + amount;
    }
}
