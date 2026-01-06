package com.Day5.problem2;

class Workout implements ITrackable {
    protected String type;
    protected int duration; // in minutes
    protected int caloriesBurned;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = 0;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started!");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped!");
        calculateCalories();
    }

    public void calculateCalories() {
        caloriesBurned = duration * 5; // default
        System.out.println("Calories burned: " + caloriesBurned);
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}
