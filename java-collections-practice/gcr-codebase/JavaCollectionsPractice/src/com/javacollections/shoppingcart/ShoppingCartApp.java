package com.javacollections.shoppingcart;
//Main class for Shopping Cart

import java.util.Scanner;

public class ShoppingCartApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     CartManager manager = new CartManager();

     System.out.print("Enter number of items: ");
     int n = sc.nextInt();

     // Add items
     for (int i = 0; i < n; i++) {
         System.out.print("Enter product name: ");
         String product = sc.next();
         System.out.print("Enter price: ");
         int price = sc.nextInt();

         manager.addItem(product, price);
     }

     manager.showAllItems();        // HashMap
     manager.showCartOrder();       // LinkedHashMap
     manager.showSortedByPrice();   // TreeMap

     sc.close();
 }
}

