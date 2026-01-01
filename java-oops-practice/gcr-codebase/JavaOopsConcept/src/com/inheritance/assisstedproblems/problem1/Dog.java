package com.inheritance.assisstedproblems.problem1;

class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound()
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}
