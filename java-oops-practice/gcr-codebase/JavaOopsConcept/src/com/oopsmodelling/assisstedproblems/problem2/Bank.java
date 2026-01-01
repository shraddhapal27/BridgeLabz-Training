package com.oopsmodelling.assisstedproblems.problem2;

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    // Association method
    void openAccount(Customer customer, int accNo, double initialBalance) {
        Account account = new Account(accNo, initialBalance);
        customer.addAccount(account);

        System.out.println("Account opened in " + bankName +
                           " for " + customer.customerName);
    }
}

