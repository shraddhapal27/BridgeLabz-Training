package com.encapsulation.problem7;

public class HospitalManagementSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rahul", 35, "Fracture", 5, 3000);
        Patient p2 = new OutPatient(102, "Anita", 28, "Fever", 500);

        Patient[] patients = { p1, p2 };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: ₹" + p.calculateBill());

            p.addRecord("Routine checkup completed");
            p.viewRecords();

            System.out.println("-------------------------");
        }
    }
}
