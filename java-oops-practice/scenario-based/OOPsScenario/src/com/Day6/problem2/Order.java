package com.Day6.problem2;

public class Order {

	 private String userName;
	 private Book book;
	 private int quantity;
	 private boolean orderPlaced;     // restricted access

	 // Constructor
	 public Order(String userName, Book book, int quantity) {
	     this.userName = userName;
	     this.book = book;
	     this.quantity = quantity;
	     orderPlaced = false;
	 }

	 // Place order
	 public void placeOrder() {
	     if (quantity <= book.getStock()) {
	         book.reduceStock(quantity);
	         orderPlaced = true;
	     }
	 }

	 // Calculate total cost
	 public double calculateTotal() {
	     double total = book.price * quantity;
	     double discount = book.applyDiscount(quantity);
	     return total - discount;
	 }

	 public boolean isOrderPlaced() {
	     return orderPlaced;
	 }
	}