package com.Day7.problem1;


import java.time.LocalDate;

class Tablet extends Medicine {

    Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public void checkExpiry() {
        if (expiryDate.isBefore(LocalDate.now()))
            System.out.println(name + " (Tablet) is expired");
        else
            System.out.println(name + " (Tablet) is safe to use");
    }
}
