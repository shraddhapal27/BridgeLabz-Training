package com.oopsmodelling.assisstedproblems.problem2;

public class UseBank {
    public static void main(String[] args) {

        // Creating Bank
        Bank bank = new Bank("State Bank of India");

        // Creating Customers
        Customer c1 = new Customer("Amit");
        Customer c2 = new Customer("Neha");

        // Opening accounts
        bank.openAccount(c1, 101, 5000);
        bank.openAccount(c1, 102, 12000);

        bank.openAccount(c2, 201, 8000);

        // Customers viewing balance
        c1.viewBalance();
        c2.viewBalance();
    }
}
