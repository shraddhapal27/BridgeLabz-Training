package com.Day5.problem2;

class StrengthWorkout extends Workout {
    public StrengthWorkout(String type, int duration) {
        super(type, duration);
    }

    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 6;
        System.out.println("Strength calories burned: " + caloriesBurned);
    }
}