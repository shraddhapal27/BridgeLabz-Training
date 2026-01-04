package com.Day2.problem1;

public class HospitalSystem {
    public static void main(String[] args) {

        // Patients
        Patient p1 = new InPatient(101, "Amit", 5);
        Patient p2 = new OutPatient(102, "Neha");

        // Doctor
        Doctor d1 = new Doctor(1, "Dr. Sharma", "Cardiology");

        // Display info (Polymorphism)
        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        // Billing
        Bill bill = new Bill(5000, 0.18, 500);
        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}
