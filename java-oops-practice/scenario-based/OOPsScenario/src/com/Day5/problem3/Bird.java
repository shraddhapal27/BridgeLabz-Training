package com.Day5.problem3;

class Bird extends Pet {
    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! 🐦");
    }
}
