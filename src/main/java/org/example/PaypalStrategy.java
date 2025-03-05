package org.example;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public String checkout() {
        return "Transaction paypal effectuée avec succès.";
    }
}
