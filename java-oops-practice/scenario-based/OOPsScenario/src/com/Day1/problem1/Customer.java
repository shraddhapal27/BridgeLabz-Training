package com.Day1.problem1;

class Customer {
    private String name;
    private Account account;

    Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    void deposit(double amount) {
        account.deposit(amount);
    }

    void withdraw(double amount) {
        account.withdraw(amount);
    }

    void applyInterest() {
        account.calculateInterest();
    }

    void showDetails() {
        System.out.println("Customer Name: " + name);
        account.showBalance();
    }
}
