package com.Day7.problem1;

import java.time.LocalDate;
public class MediStoreApp {
    public static void main(String[] args) {

        Medicine m1 = new Tablet("Paracetamol", 20, LocalDate.of(2026, 6, 10));
        Medicine m2 = new Syrup("Cough Syrup", 120, LocalDate.of(2026, 1, 15));
        Medicine m3 = new Injection("Insulin", 350, LocalDate.of(2025, 12, 1));

        m1.sell(5);
        m1.checkExpiry();

        System.out.println();

        m2.sell(3);
        m2.checkExpiry();

        System.out.println();

        m3.sell(2);
        m3.checkExpiry();
    }
}
