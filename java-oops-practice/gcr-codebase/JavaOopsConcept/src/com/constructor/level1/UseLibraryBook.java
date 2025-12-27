package com.constructor.level1;

public class UseLibraryBook {
	 public static void main(String[] args) {
      
		 LibraryBook b1 = new LibraryBook("Java Basics", "James Gosling", 499.99);
		 b1.displayBook();

	        // Borrowing the book
	        b1.borrowBook();

	        // Trying to borrow again
	        b1.borrowBook();

	        b1.displayBook();
	    }
}
