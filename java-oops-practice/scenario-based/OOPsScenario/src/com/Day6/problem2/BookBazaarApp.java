package com.Day6.problem2;

import java.util.Scanner;

public class BookBazaarApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // User input
     System.out.print("Enter user name: ");
     String user = sc.nextLine();

     System.out.print("Enter book title: ");
     String title = sc.nextLine();

     System.out.print("Enter author name: ");
     String author = sc.nextLine();

     System.out.print("Enter price: ");
     double price = sc.nextDouble();

     System.out.print("Enter stock: ");
     int stock = sc.nextInt();

     System.out.print("Enter quantity: ");
     int qty = sc.nextInt();

     System.out.print("Book type (1-EBook, 2-Printed): ");
     int choice = sc.nextInt();

     Book book;

     // Polymorphism
     if (choice == 1) {
         book = new EBook(title, author, price, stock);
     } else {
         book = new PrintedBook(title, author, price, stock);
     }

     // Create order
     Order order = new Order(user, book, qty);
     order.placeOrder();

     // Output
     if (order.isOrderPlaced()) {
         System.out.println("Order Placed Successfully");
         System.out.println("Total Amount: " + order.calculateTotal());
     } else {
         System.out.println("Order Failed (Insufficient Stock)");
     }

     sc.close();
 }
}
