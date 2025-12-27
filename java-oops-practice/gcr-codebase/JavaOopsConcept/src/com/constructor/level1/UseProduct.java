package com.constructor.level1;

public class UseProduct {
	public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 25000);
        Product p3 = new Product("Headphones", 3000);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        p3.displayProductDetails();
        System.out.println();

        // Calling class method
        Product.displayTotalProducts();
    }
}
