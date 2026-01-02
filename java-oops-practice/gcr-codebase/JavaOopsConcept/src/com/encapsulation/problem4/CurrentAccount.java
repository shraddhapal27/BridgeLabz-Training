package com.encapsulation.problem4;

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.01; // 1% interest
    }
}

