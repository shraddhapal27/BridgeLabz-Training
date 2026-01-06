package com.Day5.problem3;

import java.util.*;
class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    private int hunger; // 0 (full) to 100 (starving)
    private int mood;   // 0 (sad) to 100 (happy)
    private int energy; // 0 (tired) to 100 (energetic)

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = new Random().nextInt(50); // random default
        this.mood = new Random().nextInt(50);
        this.energy = new Random().nextInt(50);
    }

    // Encapsulated getters
    public int getHunger() { return hunger; }
    public int getMood() { return mood; }
    public int getEnergy() { return energy; }

    // Interface methods
    @Override
    public void feed() {
        hunger -= 10;
        if (hunger < 0) hunger = 0;
        energy += 5;
        mood += 5;
        System.out.println(name + " has been fed.");
    }

    @Override
    public void play() {
        energy -= 10;
        hunger += 5;
        mood += 10;
        System.out.println(name + " is playing!");
    }

    @Override
    public void sleep() {
        energy += 20;
        hunger += 5;
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void status() {
        System.out.println(name + " | Type: " + type + " | Age: " + age +
                           " | Hunger: " + hunger + " | Mood: " + mood + " | Energy: " + energy);
    }
}
