package com.oopsmodelling.selfproblems.problem4;

import java.util.ArrayList;

class Order {
    int orderId;
    ArrayList<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Aggregation
    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;

        for (Product p : products) {
            p.displayProduct();
            total += p.price;
        }

        System.out.println("Total Amount: ₹" + total);
        System.out.println();
    }
}
