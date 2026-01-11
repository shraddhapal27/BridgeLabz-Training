package com.Day8.problem2;

import java.util.*;
import java.util.Arrays;

public class FoodLoopApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu Items
        VegItem paneer = new VegItem("Paneer Butter Masala", 250, 5);
        VegItem burger = new VegItem("Veg Burger", 120, 10);
        NonVegItem chicken = new NonVegItem("Chicken Biryani", 300, 5);

        System.out.println("Welcome to FoodLoop 🍽️");
        System.out.println("1. Veg Burger");
        System.out.println("2. Paneer Butter Masala");
        System.out.println("3. Chicken Biryani");

        Order order = new Order(); // User-defined order

        System.out.print("Enter number of items you want to order: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Choose item (1/2/3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> order.addItem(burger);
                case 2 -> order.addItem(paneer);
                case 3 -> order.addItem(chicken);
                default -> System.out.println("Invalid choice");
            }
        }

        order.placeOrder();
        sc.close();
    }
}