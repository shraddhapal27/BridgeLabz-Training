package com.exceptionhandling.banktransactionsystem;

public class BankTransaction {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(6000); // try: -100 or 2000
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
