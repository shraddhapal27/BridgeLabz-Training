package com.Day2.problem5;

class Light extends Appliance {

    public Light(String name, int power) {
        super(name, power);
    }

    @Override
    public void turnOn() {
        System.out.println("Light glows softly 😶‍🌫️");
    }
}
