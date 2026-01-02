package com.encapsulation.problem7;

abstract class Patient implements MedicalRecord {

    private int patientId;
    private String name;
    private int age;

    // Sensitive data (Encapsulation)
    private String diagnosis;
    private String medicalHistory = "";

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    // Encapsulated methods for medical records
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    public void viewRecords() {
        System.out.println("Medical History:\n" + medicalHistory);
    }
}

   
