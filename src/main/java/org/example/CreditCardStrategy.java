package org.example;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public String checkout() {
        return "Transaction par carte de crédit effectuée avec succès.";
    }
}
