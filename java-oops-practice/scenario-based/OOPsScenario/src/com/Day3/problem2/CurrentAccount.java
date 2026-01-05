package com.Day3.problem2;

class CurrentAccount extends Account {
    private double interestRate = 2.0;

    CurrentAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Current Account Interest Added: " + interest);
    }
}
