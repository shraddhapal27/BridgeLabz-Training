package com.functionalinterface.problem10;

public interface PaymentProcessor {
    void pay(double amount);

    // Default refund method
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed by default method.");
    }
}
