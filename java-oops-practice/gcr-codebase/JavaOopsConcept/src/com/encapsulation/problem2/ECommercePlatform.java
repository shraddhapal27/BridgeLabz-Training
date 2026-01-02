package com.encapsulation.problem2;

import java.util.ArrayList;

public class ECommercePlatform {

    static void printFinalPrice(Product p) {
        double tax = 0;

        if (p instanceof Taxable) {
            tax = ((Taxable) p).calculateTax();
        }

        double discount = p.calculateDiscount();
        double finalPrice = p.price + tax - discount;

        p.displayProduct();

        if (p instanceof Taxable) {
            System.out.println(((Taxable) p).getTaxDetails());
        }

        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "Jacket", 3000));
        products.add(new Groceries(3, "Rice", 1200));

        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}

