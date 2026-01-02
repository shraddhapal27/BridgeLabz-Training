package com.encapsulation.problem4;

import java.util.ArrayList;

public class BankSystem {

    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount("SAV101", "Amit", 60000);
        BankAccount acc2 = new CurrentAccount("CUR202", "Neha", 40000);

        accounts.add(acc1);
        accounts.add(acc2);

        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());

            double interest = acc.calculateInterest();
            System.out.println("Interest: " + interest);

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan(100000);
                System.out.println("Loan Eligible: " + loanAcc.calculateLoanEligibility());
            }

            System.out.println("------------------------");
        }
    }
}
