package com.Day5.problem2;

class CardioWorkout extends Workout {
	class CardioWorkout extends Workout {
	    public CardioWorkout(String type, int duration) {
	        super(type, duration);
	    }

	    @Override
	    public void calculateCalories() {
	        caloriesBurned = duration * 8;
	        System.out.println("Cardio calories burned: " + caloriesBurned);
	    }
	}