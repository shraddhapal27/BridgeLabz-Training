package com.Day4.problem2;

class PerishableProduct extends Product {

    PerishableProduct(String name, double price, int quantity) {
        super(name, price, "Perishable", quantity);
    }

    @Override
    double getDiscount() {
        return getTotalPrice() * 0.10; // 10% discount
    }
}
