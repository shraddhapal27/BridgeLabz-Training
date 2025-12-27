package com.constructor.level1;

public class LibraryBook {
  String title;
  String author;
  double price;
  boolean availability;
  
  LibraryBook(String title, String author, double price) {
	  this.title = title;
	  this.author = author;
      this.price = price;
      this.availability = true; // book is available initially
  }
  
  // Method to borrow a book
  void borrowBook() {
	  if(availability) {
		  availability = false;
		  System.out.println("You have successfully borrowed: " + title);
	  } else {
          System.out.println("Sorry, the book is currently not available.");
      }
	  
	  
  }
  // Method to display book details
  void displayBook() {
      System.out.println("Title       : " + title);
      System.out.println("Author      : " + author);
      System.out.println("Price       : " + price);
      System.out.println("Available   : " + availability);
      System.out.println("---------------------------");
  }
}
