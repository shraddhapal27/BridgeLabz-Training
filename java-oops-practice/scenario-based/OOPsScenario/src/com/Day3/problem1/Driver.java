package com.Day3.problem1;

class Driver {
    private String name;
    private String licenseNumber;
    private double rating; // sensitive

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getDriverInfo() {
        return name + " | License: " + licenseNumber;
    }

    public double getRating() {
        return rating;
    }
}
