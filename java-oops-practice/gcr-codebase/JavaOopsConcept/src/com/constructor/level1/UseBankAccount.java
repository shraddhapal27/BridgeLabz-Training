package com.constructor.level1;

public class UseBankAccount {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(
                "SB12345",
                "Shraddha Pal",
                25000,
                4.5
        );

        sa.displayAccountDetails();

        // Modifying balance using public methods
        sa.deposit(5000);
        sa.withdraw(3000);

        System.out.println("\nAfter Transactions:");
        System.out.println("Updated Balance : ₹" + sa.getBalance());
    }
}
