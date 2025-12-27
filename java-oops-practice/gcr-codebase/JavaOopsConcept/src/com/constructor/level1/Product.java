package com.constructor.level1;

public class Product {
	
	  // Instance variables
    String productName;
    double price;

    // Class variable
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increase count whenever a product is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

}
