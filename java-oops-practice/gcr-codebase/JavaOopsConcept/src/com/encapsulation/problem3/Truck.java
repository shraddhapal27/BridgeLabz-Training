package com.encapsulation.problem3;

class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNo;

    public Truck(String number, double rate, String policyNo) {
        super(number, "Truck", rate);
        this.insurancePolicyNo = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; // extra maintenance
    }

    @Override
    public double calculateInsurance() {
        return 1500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance | Policy No: " + insurancePolicyNo;
    }
}
