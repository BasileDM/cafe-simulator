package org.example;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public String checkout(int amount) {
        return "Transaction paypal de " + amount + "€ terminée.";
    }
}
