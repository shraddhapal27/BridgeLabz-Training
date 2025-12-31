/*
Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/


import java.util.Scanner;

public class TrainReservationQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 50;
        boolean running = true;

        while (running) {

            System.out.println("\n TRAIN RESERVATION SYSTEM ");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1: // Book Ticket
                    if (totalSeats == 0) {
                        System.out.println(" No seats available. Booking closed!");
                        break;
                    }

                    System.out.print("Enter number of seats to book: ");
                    int seatsToBook = sc.nextInt();

                    if (seatsToBook <= 0) {
                        System.out.println(" Invalid number of seats!");
                    } else if (seatsToBook <= totalSeats) {
                        totalSeats -= seatsToBook;
                        System.out.println(" Ticket booked successfully!");
                        System.out.println("Remaining seats: " + totalSeats);
                    } else {
                        System.out.println(" Not enough seats available!");
                    }

                    // Stop booking when seats become zero
                    if (totalSeats == 0) {
                        System.out.println(" All seats booked. System stopping.");
                        running = false;
                    }
                    break;

                case 2: // Check Seats
                    System.out.println("Available seats: " + totalSeats);
                    break;

                case 3: // Exit
                    System.out.println("Thank you for using Train Reservation System!");
                    running = false;
                    break;

                default:
                    System.out.println(" Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
