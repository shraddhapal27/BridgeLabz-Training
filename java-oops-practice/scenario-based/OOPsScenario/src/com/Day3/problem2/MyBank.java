package com.Day3.problem2;

public class MyBank {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(101, 5000);
        Account acc2 = new CurrentAccount(201, 10000);

        acc1.deposit(2000);
        acc1.calculateInterest();
        acc1.checkBalance();

        System.out.println();

        acc2.withdraw(3000);
        acc2.calculateInterest();
        acc2.checkBalance();
    }
}
