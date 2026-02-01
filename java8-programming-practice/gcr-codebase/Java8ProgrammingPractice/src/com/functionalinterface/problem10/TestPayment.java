package com.functionalinterface.problem10;

public class TestPayment {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        PaymentProcessor stripe = new Stripe();

        paypal.pay(500);
        paypal.refund(200);

        stripe.pay(1000);
        stripe.refund(500);
    }
}

