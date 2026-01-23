package com.exceptionhandling.banktransactionsystem;

public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount < 0) {
            // Unchecked exception
            throw new IllegalArgumentException("Invalid amount!");
        }

        if (amount > balance) {
            // Checked custom exception
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}
