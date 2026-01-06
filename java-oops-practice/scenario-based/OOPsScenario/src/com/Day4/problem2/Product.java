package com.Day4.problem2;

class Product {
    protected String name;
    protected double price;
    protected String category;
    protected int quantity;

    Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;   // operator usage
    }

    double getDiscount() {
        return 0; // default → polymorphism
    }
}

