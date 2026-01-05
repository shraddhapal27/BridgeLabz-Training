package com.Day1.problem1;

public class BankSystem {
    public static void main(String[] args) {

        Account savings = new SavingsAccount(5000, 5);
        Customer c1 = new Customer("Rahul", savings);

        c1.deposit(2000);
        c1.withdraw(1000);
        c1.applyInterest();
        c1.showDetails();

        System.out.println();

        Account current = new CurrentAccount(10000);
        Customer c2 = new Customer("Amit", current);

        c2.deposit(3000);
        c2.withdraw(5000);
        c2.applyInterest();
        c2.showDetails();
    }
}
