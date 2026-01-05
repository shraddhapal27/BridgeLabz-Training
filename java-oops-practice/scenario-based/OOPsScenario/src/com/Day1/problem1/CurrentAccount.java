package com.Day1.problem1;

class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("No interest for Current Account");
    }
}
