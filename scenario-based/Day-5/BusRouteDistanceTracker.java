/*
Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
*/

import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int stopNumber = 1;
        char choice;

        System.out.println(" Bus Route Distance Tracker");

        while (true) {

            System.out.print("\nEnter distance covered till Stop " + stopNumber + " (in km): ");
            int distance = sc.nextInt();

            totalDistance += distance;

            System.out.println("Total distance so far: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (Y/N): ");
            choice = sc.next().charAt(0);

            if (choice == 'Y' || choice == 'y') {
                System.out.println("\nPassenger got off at Stop " + stopNumber);
                break;
            }

            stopNumber++;
        }

        System.out.println("\n Journey Ended");
        System.out.println("Total distance travelled: " + totalDistance + " km");

        sc.close();
    }
}
