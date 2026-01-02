package com.inheritance.multilevelinheritance.problem1;

public class OnlineRetailOrderSystem {
    public static void main(String[] args) {

        Order o1 = new Order(101, "01-01-2026");
        Order o2 = new ShippedOrder(102, "02-01-2026", "TRK78945");
        Order o3 = new DeliveredOrder(103, "03-01-2026", "TRK45678", "05-01-2026");

        o1.displayDetails();
        System.out.println();

        o2.displayDetails();
        System.out.println();

        o3.displayDetails();
    }
}

