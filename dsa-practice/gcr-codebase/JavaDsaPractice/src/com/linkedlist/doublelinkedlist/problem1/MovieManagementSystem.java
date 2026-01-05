package com.linkedlist.doublelinkedlist.problem1;

import java.util.*;
public class MovieManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        int choice = 0;

        while (choice != 10) {
            System.out.println("\n--- Movie Management Menu ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by Title");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Reverse");
            System.out.println("9. Update Rating");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1 || choice == 2 || choice == 3) {
                System.out.print("Title: ");
                String t = sc.nextLine();
                System.out.print("Director: ");
                String d = sc.nextLine();
                System.out.print("Year: ");
                int y = sc.nextInt();
                System.out.print("Rating: ");
                double r = sc.nextDouble();

                if (choice == 1)
                    list.addAtBeginning(t, d, y, r);
                else if (choice == 2)
                    list.addAtEnd(t, d, y, r);
                else {
                    System.out.print("Position: ");
                    int p = sc.nextInt();
                    list.addAtPosition(p, t, d, y, r);
                }
            }

            else if (choice == 4) {
                System.out.print("Enter title: ");
                list.removeByTitle(sc.nextLine());
            }

            else if (choice == 5) {
                System.out.print("Enter director: ");
                list.searchByDirector(sc.nextLine());
            }

            else if (choice == 6) {
                System.out.print("Enter rating: ");
                list.searchByRating(sc.nextDouble());
            }

            else if (choice == 7) {
                list.displayForward();
            }

            else if (choice == 8) {
                list.displayReverse();
            }

            else if (choice == 9) {
                System.out.print("Enter title: ");
                String t = sc.nextLine();
                System.out.print("New rating: ");
                double r = sc.nextDouble();
                list.updateRating(t, r);
            }

            else if (choice == 10) {
                System.out.println("Program terminated");
            }

            else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}