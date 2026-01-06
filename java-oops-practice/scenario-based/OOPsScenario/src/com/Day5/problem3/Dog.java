package com.Day5.problem3;

class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! 🐶");
    }
}
