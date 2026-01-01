package com.oopsmodelling.selfproblems.problem3;

import java.util.ArrayList;

class Doctor {
    String doctorName;
    String specialization;
    ArrayList<Patient> patients;

    Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Communication method
    void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);

        System.out.println("Consultation:");
        System.out.println("Doctor " + doctorName +
                           " (" + specialization + ")" +
                           " is consulting patient " + patient.patientName);
        System.out.println();
    }

    void showPatients() {
        System.out.println("Doctor: " + doctorName);
        for (Patient p : patients) {
            System.out.println("Patient: " + p.patientName);
        }
        System.out.println();
    }
}
