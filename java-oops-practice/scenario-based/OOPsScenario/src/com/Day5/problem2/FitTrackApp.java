package com.Day5.problem2;

import java.util.*;
public class FitTrackApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create user
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter daily calorie goal (or 0 for default): ");
        int goal = sc.nextInt();
        sc.nextLine(); // consume newline

        UserProfile user;
        if (goal > 0) {
            user = new UserProfile(name, age, weight, goal);
        } else {
            user = new UserProfile(name, age, weight);
        }

        // Create workouts
        Workout cardio = new CardioWorkout();
        Workout strength = new StrengthWorkout("Weight Training", 45);

        // Start & Stop Cardio
        cardio.startWorkout();
        cardio.stopWorkout();
        user.trackProgress(cardio.getCaloriesBurned());

        // Start & Stop Strength
        strength.startWorkout();
        strength.stopWorkout();
        user.trackProgress(strength.getCaloriesBurned());
    }
}
