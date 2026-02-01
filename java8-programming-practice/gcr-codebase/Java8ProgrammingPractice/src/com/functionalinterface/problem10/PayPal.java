package com.functionalinterface.problem10;

public class PayPal implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via PayPal");
    }
}