package com.functionalinterface.problem10;


public class Stripe implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Stripe");
    }

    // Optional: override default refund
    @Override
    public void refund(double amount) {
        System.out.println("Stripe refund: ₹" + amount);
    }
}
