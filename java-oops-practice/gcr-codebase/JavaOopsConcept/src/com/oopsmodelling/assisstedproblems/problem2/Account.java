package com.oopsmodelling.assisstedproblems.problem2;

class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }
}
