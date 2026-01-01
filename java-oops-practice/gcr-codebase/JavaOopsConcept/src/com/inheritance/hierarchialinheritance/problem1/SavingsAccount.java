package com.inheritance.hierarchialinheritance.problem1;

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type   : Savings Account");
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}
