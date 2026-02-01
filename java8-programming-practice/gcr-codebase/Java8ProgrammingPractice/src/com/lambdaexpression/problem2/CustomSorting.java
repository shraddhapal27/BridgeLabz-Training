package com.lambdaexpression.problem2;

import java.util.*;
public class CustomSorting {

	public static void main(String[] args) {  
		
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 45000, 4.5,10));
		products.add(new Product("Smartphone", 500, 4.8, 15));
        products.add(new Product("Headphones", 100, 4.2, 20));
        products.add(new Product("Smartwatch", 200, 4.6, 5));
        
        Scanner sc = new Scanner(System.in);
		
		System.out.println("choose sorting critria: ");
		System.out.println("price / rating / discount");
     
        
        String userCriteria = sc.nextLine();
        ProductSorter.sortProducts(products, userCriteria);
        
        
        System.out.println("\n Sorted Products: ");
        products.forEach(System.out::println);
	}
}
