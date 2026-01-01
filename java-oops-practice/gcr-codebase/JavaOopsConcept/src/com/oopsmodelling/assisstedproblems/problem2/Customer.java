package com.oopsmodelling.assisstedproblems.problem2;

import java.util.ArrayList;

class Customer {
    String customerName;
    ArrayList<Account> accounts;

    Customer(String customerName) {
        this.customerName = customerName;
        accounts = new ArrayList<>();
    }

    // Customer receives account from bank
    void addAccount(Account account) {
        accounts.add(account);
    }

    // Communication method
    void viewBalance() {
        System.out.println("Customer: " + customerName);
        for (Account acc : accounts) {
            System.out.println("Account No: " + acc.accountNumber +
                               ", Balance: ₹" + acc.getBalance());
        }
        System.out.println();
    }
}
