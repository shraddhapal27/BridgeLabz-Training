package com.constructor.level1;

public class Person {

    String name;
    int age;

    // 1️⃣ Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 2️⃣ Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("------------------");
    }
}
