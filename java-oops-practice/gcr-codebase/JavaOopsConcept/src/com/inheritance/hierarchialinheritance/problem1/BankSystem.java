package com.inheritance.hierarchialinheritance.problem1;

public class BankSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SB101", 50000, 4.5);
        BankAccount acc2 = new CheckingAccount("CA202", 30000, 10000);
        BankAccount acc3 = new FixedDepositAccount("FD303", 100000, 5);

        acc1.displayDetails();
        acc1.displayAccountType();
        System.out.println();

        acc2.displayDetails();
        acc2.displayAccountType();
        System.out.println();

        acc3.displayDetails();
        acc3.displayAccountType();
    }
}

