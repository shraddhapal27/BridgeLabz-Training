package com.Day2.TrainCompartment;

import java.util.Scanner;

public class TrainCompanionApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrainCompanion train = new TrainCompanion();

        int choice;

        do {
            System.out.println("\n🚆 Train Companion Menu");
            System.out.println("1. Add Compartment");
            System.out.println("2. Remove Compartment");
            System.out.println("3. Traverse Forward");
            System.out.println("4. Traverse Backward");
            System.out.println("5. Find Compartment & Adjacent");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter compartment name: ");
                    String name = sc.nextLine();
                    train.addCompartment(name);
                    System.out.println("Compartment added successfully");
                    break;

                case 2:
                    System.out.print("Enter compartment name to remove: ");
                    String removeName = sc.nextLine();
                    train.removeCompartment(removeName);
                    break;

                case 3:
                    train.traverseForward();
                    break;

                case 4:
                    train.traverseBackward();
                    break;

                case 5:
                    System.out.print("Enter compartment name to search: ");
                    String searchName = sc.nextLine();
                    train.findCompartment(searchName);
                    break;

                case 6:
                    System.out.println("Exiting Train Companion App 🚆");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
