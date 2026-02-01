package com.functionalinterface.problem8;

public class TestConversion {
    public static void main(String[] args) {
        double km = 10;
        System.out.println(km + " km = " + UnitConverter.kmToMiles(km) + " miles");

        double kg = 50;
        System.out.println(kg + " kg = " + UnitConverter.kgToLbs(kg) + " lbs");
    }
}
