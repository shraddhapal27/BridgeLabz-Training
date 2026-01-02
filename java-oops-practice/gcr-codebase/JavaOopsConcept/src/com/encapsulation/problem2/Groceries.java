package com.encapsulation.problem2;

class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.05; // 5% discount
    }
}
