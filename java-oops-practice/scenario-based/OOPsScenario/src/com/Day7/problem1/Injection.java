package com.Day7.problem1;


import java.time.LocalDate;
class Injection extends Medicine {

    Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public void checkExpiry() {
        if (expiryDate.isBefore(LocalDate.now()))
            System.out.println(name + " (Injection) expired – discard");
        else
            System.out.println(name + " (Injection) usable");
    }
}
