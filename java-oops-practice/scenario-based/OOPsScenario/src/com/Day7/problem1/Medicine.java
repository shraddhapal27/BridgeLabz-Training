package com.Day7.problem1;

import java.time.LocalDate;

abstract class Medicine implements ISellable {

    protected String name;
    protected LocalDate expiryDate;
    private double price;
    private int quantity;

    // Constructor with default quantity
    Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    // Constructor with custom quantity
    Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulation: hide internal data
    protected int getQuantity() {
        return quantity;
    }

    // Private pricing logic
    private double applyDiscount(double total) {
        if (total > 500)
            return total * 0.9; // 10% discount
        return total;
    }

    // Sell medicine
    public void sell(int qty) {
        if (quantity >= qty) {
            double total = price * qty;
            total = applyDiscount(total);
            quantity -= qty;
            System.out.println(name + " sold. Total price: " + total);
        } else {
            System.out.println("Insufficient stock for " + name);
        }
    }

    // Polymorphism
    public abstract void checkExpiry();
}


