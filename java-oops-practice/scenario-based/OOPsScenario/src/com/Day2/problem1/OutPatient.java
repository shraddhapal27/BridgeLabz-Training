package com.Day2.problem1;

class OutPatient extends Patient {

    public OutPatient(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient Visit");
    }
}
