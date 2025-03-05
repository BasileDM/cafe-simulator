package org.example;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext() {
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void processPayment(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        String message = paymentStrategy.checkout(amount);
        View.displayMessage(message);
    }
}
