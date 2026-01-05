package com.Day2.problem4;

abstract class Wallet implements Transferrable {

    private double balance;
    protected Transaction[] history = new Transaction[10];
    protected int index = 0;

    // Constructor without referral bonus
    public Wallet(double balance) {
        this.balance = balance;
    }

    // Constructor with referral bonus
    public Wallet(double balance, double referralBonus) {
        this.balance = balance + referralBonus;
    }

    // Encapsulation
    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    protected void addTransaction(String type, double amount) {
        if (index < history.length) {
            history[index++] = new Transaction(type, amount);
        }
    }

    public void viewTransactions() {
        for (int i = 0; i < index; i++) {
            history[i].showTransaction();
        }
    }
}
