package com.inheritance.assisstedproblems.problem1;

class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound()
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}
