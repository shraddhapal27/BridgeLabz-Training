package com.Day2.problem4;

class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.02;

    public BusinessWallet(double balance) {
        super(balance);
    }

    public BusinessWallet(double balance, double bonus) {
        super(balance, bonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * TAX_RATE;
        double total = amount + tax;

        if (deductBalance(total)) {
            receiver.getWallet().addBalance(amount);
            addTransaction("Business Transfer", amount);
            addTransaction("Tax Deducted", tax);
            System.out.println("Transferred ₹" + amount + " (Tax ₹" + tax + ")");
        } else {
            System.out.println("Insufficient balance in Business Wallet!");
        }
    }
}
