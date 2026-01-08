package com.Day7.problem1;

import java.time.LocalDate;
class Syrup extends Medicine {

    Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public void checkExpiry() {
        if (expiryDate.isBefore(LocalDate.now().plusDays(5)))
            System.out.println(name + " (Syrup) expiring soon");
        else
            System.out.println(name + " (Syrup) is safe");
    }
}

