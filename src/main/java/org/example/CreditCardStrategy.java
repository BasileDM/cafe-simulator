package org.example;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public String checkout(int amount) {
        return "Transaction par carte de crédit de " + amount + "€ terminée.";
    }
}
