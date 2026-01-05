package com.linkedlist.circularLL.problem1;

import java.util.*;
public class TaskSchedulerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        while (true) {
            System.out.println("\n1.Add  2.Remove  3.ViewNext  4.Display  5.SearchPriority  6.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Task ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Task Name: ");
                String name = sc.nextLine();
                System.out.print("Priority: ");
                int p = sc.nextInt();
                sc.nextLine();
                System.out.print("Due Date: ");
                String date = sc.nextLine();

                TaskNode task = new TaskNode(id, name, p, date);

                System.out.print("Position (1-Begin 2-End 3-Specific): ");
                int pos = sc.nextInt();

                if (pos == 1)
                    scheduler.addAtBeginning(task);
                else if (pos == 2)
                    scheduler.addAtEnd(task);
                else {
                    System.out.print("Enter position: ");
                    scheduler.addAtPosition(task, sc.nextInt());
                }
            }

            else if (choice == 2) {
                System.out.print("Enter Task ID to remove: ");
                scheduler.removeById(sc.nextInt());
            }

            else if (choice == 3) {
                scheduler.viewNextTask();
            }

            else if (choice == 4) {
                scheduler.displayAll();
            }

            else if (choice == 5) {
                System.out.print("Enter Priority: ");
                scheduler.searchByPriority(sc.nextInt());
            }

            else if (choice == 6) {
                break;
            }
        }
        sc.close();
    }
}