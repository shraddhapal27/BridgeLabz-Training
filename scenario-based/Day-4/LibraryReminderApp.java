/*
Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int finePerDay = 5;

        System.out.println(" Rohan's Library Reminder App ");

        for (int book = 1; book <= 5; book++) {

            System.out.println("\nBook " + book + ":");

            System.out.print("Enter Due Date (day number): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date (day number): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * finePerDay;

                System.out.println("Returned late by " + lateDays + " days");
                System.out.println("Fine: rupee" + fine);
            } else {
                System.out.println("Returned on time ");
                System.out.println("Fine: rupee 0");
            }
        }

        System.out.println("\n All books processed. Thank you!");
        sc.close();
    }
}
