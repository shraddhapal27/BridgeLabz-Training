package com.Day2.problem5;

class AC extends Appliance {

    public AC(String name, int power) {
        super(name, power);
    }

    @Override
    public void turnOn() {
        System.out.println("AC cooling started ❄️");
    }
}
