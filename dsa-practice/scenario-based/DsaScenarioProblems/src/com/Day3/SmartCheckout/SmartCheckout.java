package com.Day5.SmartCheckout;

import java.util.*;

public class SmartCheckout {

    Queue<Customer> queue = new LinkedList<>();
    HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    
    SmartCheckout() {
        priceMap.put("Milk", 50);
        stockMap.put("Milk", 20);

        priceMap.put("Bread", 40);
        stockMap.put("Bread", 15);

        priceMap.put("Rice", 60);
        stockMap.put("Rice", 30);
    }

    
    void addCustomer(String name, Map<String, Integer> cart) {
        queue.add(new Customer(name, cart));
        System.out.println("Customer added to billing queue");
    }

    
    void billCustomer() {

        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer c = queue.poll();
        int total = 0;

        System.out.println("\n🧾 Billing for " + c.name);

        for (String item : c.cart.keySet()) {

            int qty = c.cart.get(item);

            if (!priceMap.containsKey(item)) {
                System.out.println(item + " not available");
                continue;
            }

            if (stockMap.get(item) < qty) {
                System.out.println("Insufficient stock for " + item);
                continue;
            }

            int price = priceMap.get(item);
            total += price * qty;
            stockMap.put(item, stockMap.get(item) - qty);

            System.out.println(item + " x " + qty + " = " + (price * qty));
        }

        System.out.println("Total Amount: ₹" + total);
    }

    
    void showStock() {
        System.out.println("\n📦 Available Stock:");
        for (String item : stockMap.keySet()) {
            System.out.println(item + " → " + stockMap.get(item));
        }
    }
}
