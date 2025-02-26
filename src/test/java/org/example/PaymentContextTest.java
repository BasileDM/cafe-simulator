package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentContextTest {
    @Test
    public void testSetStrategy() {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(new CreditCardStrategy());
        assertNotNull(paymentContext.getPaymentStrategy(), "Payment strategy should not be null");
        assertInstanceOf(CreditCardStrategy.class, paymentContext.getPaymentStrategy(), "Payment strategy should be CreditCardStrategy");
        paymentContext.setPaymentStrategy(new PaypalStrategy());
        assertInstanceOf(PaypalStrategy.class, paymentContext.getPaymentStrategy(), "Payment strategy should be PaypalStrategy");
    }
}
