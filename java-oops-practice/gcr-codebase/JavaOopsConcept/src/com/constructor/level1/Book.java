package com.constructor.level1;

public class Book {
   String title;
   String author;
   double price;
   
   // Default constructor
   Book() {
	   title = "unknown";
	   author = "unknown";
	   price = 0.0;
   }
   
   // parameterized constructor
   Book(String t, String a, double p){
	   title = t;
	   author = a;
	   price = p;
   }
   
   // method to display book dts
   public void display() {
	   System.out.println("Title: " + title);
	   System.out.println("Author: " + author);
	   System.out.println("Price: " + price);
   }

}
