package com.Day2.problem4;

public class EWalletApp {

    public static void main(String[] args) {

        User u1 = new User(1, "Amit", new PersonalWallet(3000, 500));
        User u2 = new User(2, "Neha", new BusinessWallet(10000));

        u1.showBalance();
        u2.showBalance();

        System.out.println("\n--- Transfer ---");
        u1.getWallet().transferTo(u2, 2000); // personal logic
        u2.getWallet().transferTo(u1, 3000); // business logic

        System.out.println("\n--- Updated Balances ---");
        u1.showBalance();
        u2.showBalance();

        System.out.println("\n--- Transaction History (Amit) ---");
        u1.getWallet().viewTransactions();
    }
}
