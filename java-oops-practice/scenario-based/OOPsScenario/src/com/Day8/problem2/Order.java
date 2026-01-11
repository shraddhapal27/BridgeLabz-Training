package com.Day8.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Order implements IOrderable {
    private List<FoodItem> items = new ArrayList<>();
    private double total;

    // Constructor for Combo Meal
    public Order(FoodItem... comboItems) {
        items.addAll(Arrays.asList(comboItems));
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
        } else {
            System.out.println(item.getName() + " is out of stock!");
        }
    }

    // Polymorphism
    public double applyDiscount() {
        if (total >= 500)
            return total * 0.20;
        else if (total >= 300)
            return total * 0.10;
        else
            return 0;
    }

    public void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();   // Operator usage
        }
        total -= applyDiscount();
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("\nOrder Placed Successfully!");
        System.out.println("Items Ordered:");
        for (FoodItem item : items) {
            System.out.println("- " + item.getName());
        }
        System.out.println("Total Amount: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        System.out.println("Order Cancelled!");
    }
}