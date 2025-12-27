package com.constructor.level1;

public class UseBook {
public static void main(String[] args) {
   // object using default constructor
	Book b1 = new Book();
	b1.display();
	
	// object using parameterized constructor
	Book b2 = new Book("Java Basics", "James Gosling", 499.99);
	b2.display();
 }
}
