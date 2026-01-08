package com.Day6.problem3;

//Main class
import java.util.Scanner;

public class ParkEaseApp {

public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   // Slot creation
   ParkingSlot slot = new ParkingSlot(101, "Car");

   // User input
   System.out.print("Enter vehicle number: ");
   String number = sc.nextLine();

   System.out.print("Enter vehicle type (1-Car, 2-Bike, 3-Truck): ");
   int choice = sc.nextInt();

   System.out.print("Enter parking hours: ");
   int hours = sc.nextInt();

   Vehicle vehicle;

   // Polymorphism
   if (choice == 1) {
       vehicle = new Car(number);
   } else if (choice == 2) {
       vehicle = new Bike(number);
   } else {
       vehicle = new Truck(number);
   }

   // Slot booking
   if (slot.isAvailable()) {
       slot.occupySlot();
       double amount = vehicle.calculateCharges(hours);

       System.out.println("Slot ID " + slot.getSlotId() + " Booked");
       System.out.println("Parking Charges: " + amount);

       slot.freeSlot(); // release slot
   } else {
       System.out.println("Slot Not Available");
   }

   sc.close();
}
}