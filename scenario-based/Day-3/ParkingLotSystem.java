import java.util.Scanner;

public class ParkingLotSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSlots = 3;
        int occupiedSlots = 0;
        int choice;
        boolean running = true;

        System.out.println("Welcome to the Smart Parking System");

        while (running) {
            System.out.println("\nParking Menu");
            System.out.println("1. Park vehicle");
            System.out.println("2. Exit vehicle");
            System.out.println("3. Show occupancy");
            System.out.println("4. Exit system");

            choice = sc.nextInt();

            switch (choice) {

                case 1: // Park vehicle
                    if (occupiedSlots < totalSlots) {
                        occupiedSlots++;
                        System.out.println("Vehicle parked successfully.");
                    } else {
                        System.out.println("Parking is full.");
                    }
                    break;

                case 2: // Exit vehicle
                    if (occupiedSlots > 0) {
                        occupiedSlots--;
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Parking is already empty.");
                    }
                    break;

                case 3: // Show occupancy
                    System.out.println("Total slots: " + totalSlots);
                    System.out.println("Occupied slots: " + occupiedSlots);
                    System.out.println("Available slots: " + (totalSlots - occupiedSlots));
                    break;

                case 4: // Exit system
                    System.out.println("Exiting parking system. Thank you!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
