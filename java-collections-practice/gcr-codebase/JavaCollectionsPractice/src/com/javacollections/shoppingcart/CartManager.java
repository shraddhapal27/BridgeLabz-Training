package com.javacollections.shoppingcart;

//Manages shopping cart using Map interface

import java.util.HashMap;
import java.util.LinkedHashMap;

import java.util.TreeMap;

public class CartManager {

 // Stores product and price (fast lookup)
 HashMap<String, Integer> priceMap = new HashMap<>();

 // Maintains insertion order
 LinkedHashMap<String, Integer> orderMap = new LinkedHashMap<>();

 // Add item to cart
 void addItem(String product, int price) {

     // HashMap
     priceMap.put(product, price);

     // LinkedHashMap
     orderMap.put(product, price);
 }

 // Display items as added
 void showCartOrder() {
     System.out.println("\nItems in Cart (Insertion Order):");
     for (String p : orderMap.keySet()) {
         System.out.println(p + " : " + orderMap.get(p));
     }
 }

 // Display items sorted by price
 void showSortedByPrice() {

     // Price as key for sorting
     TreeMap<Integer, String> sortedMap = new TreeMap<>();

     for (String p : priceMap.keySet()) {
         sortedMap.put(priceMap.get(p), p);
     }

     System.out.println("\nItems Sorted by Price:");
     for (Integer price : sortedMap.keySet()) {
         System.out.println(sortedMap.get(price) + " : " + price);
     }
 }

 // Display all items
 void showAllItems() {
     System.out.println("\nAll Items:");
     System.out.println(priceMap);
 }
}
