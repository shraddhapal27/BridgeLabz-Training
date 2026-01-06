package com.Day5.problem3;

import java.util.*;
public class PetPalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create pets
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Kitty", 2);
        Bird bird = new Bird("Tweety", 1);

        // Display initial status
        dog.status();
        cat.status();
        bird.status();

        System.out.println("\nInteracting with pets...");

        // Feed pets
        dog.feed();
        cat.play();
        bird.sleep();

        // Make sounds
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        // Display updated status
        System.out.println("\nUpdated status:");
        dog.status();
        cat.status();
        bird.status();
    }
}