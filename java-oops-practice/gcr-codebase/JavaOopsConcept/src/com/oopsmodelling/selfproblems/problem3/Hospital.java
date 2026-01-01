package com.oopsmodelling.selfproblems.problem3;

import java.util.ArrayList;

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors available: " + doctors.size());
        System.out.println("Patients registered: " + patients.size());
        System.out.println();
    }
}
