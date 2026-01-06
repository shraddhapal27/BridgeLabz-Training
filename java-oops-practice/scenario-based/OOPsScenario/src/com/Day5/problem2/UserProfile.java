package com.Day5.problem2;

class UserProfile {
    private String name;
    private int age;
    private double weight;   // private to protect health data
    private int dailyGoal;   // calories

    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, 500); // default daily goal
    }

    public UserProfile(String name, int age, double weight, int dailyGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyGoal = dailyGoal;
    }

    public void trackProgress(int caloriesBurned) {
        int remaining = dailyGoal - caloriesBurned;
        System.out.println(name + "'s calories remaining to reach goal: " + remaining);
    }

    // Encapsulation: getter and setter for weight
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
}
