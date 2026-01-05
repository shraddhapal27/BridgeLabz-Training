package com.Day2.problem1;

class InPatient extends Patient {
    private int daysAdmitted;

    public InPatient(int id, String name, int daysAdmitted) {
        super(id, name);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient | Days Admitted: " + daysAdmitted);
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }
}
