package com.Day4.problem2;

import java.util.ArrayList;

class Cart implements ICheckout {
    private ArrayList<Product> products;
    private double totalPrice; // protected from outside access

    // Constructor without items
    Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Constructor with pre-selected items
    Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    // Only Cart can update price
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice();
        }
    }

    void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    @Override
    public void applyDiscount() {
        double discount = 0;
        for (Product p : products) {
            discount += p.getDiscount(); // polymorphism
        }
        totalPrice = totalPrice - discount; // operator usage
    }

    @Override
    public void generateBill() {
        System.out.println("\n🛒 SwiftCart Bill");
        for (Product p : products) {
            System.out.println(p.name + " | Qty: " + p.quantity +
                    " | Price: " + p.getTotalPrice());
        }
        System.out.println("Total Payable: ₹" + totalPrice);
    }
}

