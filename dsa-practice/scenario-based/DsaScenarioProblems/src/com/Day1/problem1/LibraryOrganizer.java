package com.Day1.problem1;

import java.util.Scanner;

public class LibraryOrganizer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();

        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Display Library");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter book name: ");
                    String book = sc.nextLine();

                    shelf.addBook(genre, book);
                    break;

                case 2:
                    System.out.print("Enter genre: ");
                    String borrowGenre = sc.nextLine();

                    System.out.print("Enter book name: ");
                    String borrowBook = sc.nextLine();

                    shelf.borrowBook(borrowGenre, borrowBook);
                    break;

                case 3:
                    shelf.display();
                    break;

                case 4:
                    System.out.println("Exiting Library System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
