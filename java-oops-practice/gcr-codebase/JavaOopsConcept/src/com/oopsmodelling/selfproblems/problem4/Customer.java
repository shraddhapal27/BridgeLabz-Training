package com.oopsmodelling.selfproblems.problem4;

import java.util.ArrayList;

class Customer {
    int customerId;
    String customerName;
    ArrayList<Order> orders;

    Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    // Communication method
    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(customerName + " placed Order ID: " + order.orderId);
    }

    void viewOrders() {
        System.out.println("Customer: " + customerName);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}
