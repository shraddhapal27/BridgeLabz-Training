package com.Day2.CallCenter;

import java.util.Scanner;

public class CallCenterApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CallCenter center = new CallCenter();
        int choice;

        do {
            System.out.println("\n☎️ Call Center Menu");
            System.out.println("1. Add Incoming Call");
            System.out.println("2. Handle Next Call");
            System.out.println("3. Show Customer Call Count");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Is VIP customer? (true/false): ");
                    boolean vip = sc.nextBoolean();

                    center.addCall(name, vip);
                    break;

                case 2:
                    center.handleCall();
                    break;

                case 3:
                    center.showCallCount();
                    break;

                case 4:
                    System.out.println("Exiting Call Center ☎️");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
