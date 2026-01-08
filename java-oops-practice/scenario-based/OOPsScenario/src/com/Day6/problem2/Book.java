package com.Day6.problem2;

public class Book implements IDiscountable {

	 protected String title;
	 protected String author;
	 protected double price;
	 private int stock;          // encapsulated

	 // Constructor
	 public Book(String title, String author, double price, int stock) {
	     this.title = title;
	     this.author = author;
	     this.price = price;
	     this.stock = stock;
	 }

	 // Reduce stock safely
	 public void reduceStock(int qty) {
	     if (qty <= stock) {
	         stock = stock - qty;
	     }
	 }

	 // Get stock
	 public int getStock() {
	     return stock;
	 }

	 // Default discount (no discount)
	 public double applyDiscount(int quantity) {
	     return 0;
	 }
	}
