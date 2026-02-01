package com.functionalinterface.problem3;

import java.util.List;

public class PaymentProcessor {
    public static void main(String[] args) {
        List<Payment> payments = List.of(
                new UPI("alice@upi"),
                new CreditCard("1234-5678-9876-5432"),
                new Wallet("PayBuddy")
        );

        payments.forEach(p -> p.pay(500.0));
    }
}
