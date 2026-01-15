package com.Day9.problem1;

public class HomeNestApp {

    public static void main(String[] args) {

        Device[] devices = {
            new Light("L101"),
            new Camera("C201"),
            new Thermostat("T301"),
            new Lock("K401")
        };

        for (Device d : devices) {
            d.turnOn();
            System.out.println("Energy used in 3 hrs: " + d.calculateEnergy(3));
            d.reset();     // Polymorphism
            d.turnOff();
            System.out.println("-----------");
        }
    }
}
