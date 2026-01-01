package com.oopsmodelling.selfproblems.problem3;

import java.util.ArrayList;

class Patient {
    String patientName;
    ArrayList<Doctor> doctors;

    Patient(String patientName) {
        this.patientName = patientName;
        this.doctors = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void showDoctors() {
        System.out.println("Patient: " + patientName);
        for (Doctor d : doctors) {
            System.out.println("Consulted Doctor: " + d.doctorName);
        }
        System.out.println();
    }
}

