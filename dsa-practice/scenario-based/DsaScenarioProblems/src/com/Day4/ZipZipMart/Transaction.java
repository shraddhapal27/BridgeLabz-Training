package com.Day4.ZipZipMart;

import java.util.ArrayList;

public class Transaction {
    int transactionId;
    String date;
    double amount;

    Transaction(int transactionId, String date, double amount) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
    }

    void display() {
        System.out.println(
            "ID: " + transactionId +
            ", Date: " + date +
            ", Amount: " + amount
        );
    }
}
