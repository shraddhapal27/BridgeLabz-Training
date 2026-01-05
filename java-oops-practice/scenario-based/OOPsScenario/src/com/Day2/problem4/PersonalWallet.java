package com.Day2.problem4;

class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 5000;

    public PersonalWallet(double balance) {
        super(balance);
    }

    public PersonalWallet(double balance, double bonus) {
        super(balance, bonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > TRANSFER_LIMIT) {
            System.out.println("Transfer limit exceeded!");
            return;
        }

        if (deductBalance(amount)) {
            receiver.getWallet().addBalance(amount);
            addTransaction("Sent", amount);
            System.out.println("Transferred ₹" + amount + " to " + receiver.getName());
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
