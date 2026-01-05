package com.Day3.problem2;

class SavingsAccount extends Account {
    private double interestRate = 4.0;

    SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Savings Account Interest Added: " + interest);
    }
}

