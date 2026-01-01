package com.inheritance.assisstedproblems.problem1;

class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound()
    @Override
    void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}
