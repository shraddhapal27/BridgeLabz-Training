package com.Day2.problem1;

class Patient {
    private int patientId;
    private String name;
    private String medicalHistory; // sensitive data

    // Constructor for normal admission
    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = "Not Provided";
    }

    // Overloaded constructor for emergency admission
    public Patient(int patientId, String name, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    // Getter (Encapsulation)
    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }

    // Polymorphic method
    public void displayInfo() {
        System.out.println(getSummary());
    }
}
