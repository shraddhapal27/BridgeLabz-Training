package com.Day5.SmartCheckout;

import java.util.*;

public class SmartCheckoutApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartCheckout checkout = new SmartCheckout();
        int choice;

        do {
            System.out.println("\n🛒 Smart Checkout Menu");
            System.out.println("1. Add Customer");
            System.out.println("2. Bill Customer");
            System.out.println("3. Show Stock");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    Map<String, Integer> cart = new HashMap<>();
                    System.out.print("Enter number of items: ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        sc.nextLine();
                        System.out.print("Item name: ");
                        String item = sc.nextLine();
                        System.out.print("Quantity: ");
                        int qty = sc.nextInt();
                        cart.put(item, qty);
                    }

                    checkout.addCustomer(name, cart);
                    break;

                case 2:
                    checkout.billCustomer();
                    break;

                case 3:
                    checkout.showStock();
                    break;

                case 4:
                    System.out.println("Exiting Smart Checkout 🛒");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}

