package com.Day2.problem5;

class Fan extends Appliance {

    public Fan(String name, int power) {
        super(name, power);
    }

    @Override
    public void turnOn() {
        System.out.println("Fan starts rotating 🌀");
    }
}
