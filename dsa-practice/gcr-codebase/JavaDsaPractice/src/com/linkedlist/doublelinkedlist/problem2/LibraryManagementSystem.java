package com.linkedlist.doublelinkedlist.problem2;

import java.util.*;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n1.Add  2.Remove  3.Search  4.Update  5.DisplayF  6.DisplayR  7.Count  8.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Title: ");
                String title = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();
                System.out.print("Genre: ");
                String genre = sc.nextLine();
                System.out.print("Book ID: ");
                int id = sc.nextInt();
                System.out.print("Available(true/false): ");
                boolean avail = sc.nextBoolean();

                BookNode book = new BookNode(title, author, genre, id, avail);

                System.out.print("Position (1-Begin, 2-End, 3-Specific): ");
                int pos = sc.nextInt();

                if (pos == 1)
                    lib.addAtBeginning(book);
                else if (pos == 2)
                    lib.addAtEnd(book);
                else {
                    System.out.print("Enter position: ");
                    lib.addAtPosition(book, sc.nextInt());
                }
            }

            else if (choice == 2) {
                System.out.print("Enter Book ID to remove: ");
                lib.removeById(sc.nextInt());
            }

            else if (choice == 3) {
                System.out.print("Enter Title or Author: ");
                lib.search(sc.nextLine());
            }

            else if (choice == 4) {
                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                System.out.print("Available(true/false): ");
                lib.updateAvailability(id, sc.nextBoolean());
            }

            else if (choice == 5)
                lib.displayForward();

            else if (choice == 6)
                lib.displayReverse();

            else if (choice == 7)
                lib.countBooks();

            else if (choice == 8)
                break;
        }
        sc.close();
    }
}