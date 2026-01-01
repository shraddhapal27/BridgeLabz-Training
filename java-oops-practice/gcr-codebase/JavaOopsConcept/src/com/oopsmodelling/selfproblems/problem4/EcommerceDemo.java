package com.oopsmodelling.selfproblems.problem4;

public class EcommerceDemo {
    public static void main(String[] args) {

        // Products
        Product p1 = new Product(1, "Laptop", 55000);
        Product p2 = new Product(2, "Headphones", 2000);
        Product p3 = new Product(3, "Mouse", 800);

        // Customer
        Customer customer = new Customer(101, "Amit");

        // Order
        Order order1 = new Order(5001);
        order1.addProduct(p1);
        order1.addProduct(p3);

        Order order2 = new Order(5002);
        order2.addProduct(p2);

        // Association: Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // View details
        customer.viewOrders();
    }
}

