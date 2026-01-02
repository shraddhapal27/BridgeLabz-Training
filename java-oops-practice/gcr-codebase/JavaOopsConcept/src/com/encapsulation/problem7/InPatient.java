package com.encapsulation.problem7;

class InPatient extends Patient {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, String diagnosis,
                     int daysAdmitted, double dailyCharge) {
        super(id, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}
