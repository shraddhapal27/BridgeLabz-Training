package com.oopsmodelling.selfproblems.problem3;

public class UseHospital {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Dr. Verma", "Cardiologist");
        Doctor d2 = new Doctor("Dr. Singh", "Orthopedic");

        Patient p1 = new Patient("Rahul");
        Patient p2 = new Patient("Anita");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.showHospitalDetails();

        // Consultations (Association + Communication)
        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p1);

        // Viewing relationships
        d1.showPatients();
        d2.showPatients();

        p1.showDoctors();
        p2.showDoctors();
    }
}
