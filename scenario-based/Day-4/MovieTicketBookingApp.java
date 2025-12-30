/*
 Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
*/


import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continueBooking = true;

        System.out.println(" Welcome to Movie Ticket Booking App ");

        while (continueBooking) {

            int totalAmount = 0;

            // Movie type
            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Horror");
            System.out.print("Enter choice: ");
            int movieChoice = sc.nextInt();

            switch (movieChoice) {
                case 1:
                    totalAmount += 200;
                    System.out.println("Movie Selected: Action");
                    break;
                case 2:
                    totalAmount += 150;
                    System.out.println("Movie Selected: Comedy");
                    break;
                case 3:
                    totalAmount += 180;
                    System.out.println("Movie Selected: Horror");
                    break;
                default:
                    System.out.println("Invalid movie choice!");
                    continue;
            }

            // Seat type
            System.out.print("\nEnter Seat Type (Gold/Silver): ");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("Gold")) {
                totalAmount += 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                totalAmount += 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            // Snacks
            System.out.print("\nDo you want snacks? (Yes/No): ");
            String snacksChoice = sc.next();

            if (snacksChoice.equalsIgnoreCase("Yes")) {
                totalAmount += 80;
            }

            // Final Bill
            System.out.println("\n Booking Successful!");
            System.out.println("Total Amount to Pay: ₹" + totalAmount);

            // Continue?
            System.out.print("\nBook for another customer? (Yes/No): ");
            String again = sc.next();

            if (!again.equalsIgnoreCase("Yes")) {
                continueBooking = false;
            }
        }

        System.out.println("\n Thank you for using Movie Ticket Booking App!");
        sc.close();
    }
}
