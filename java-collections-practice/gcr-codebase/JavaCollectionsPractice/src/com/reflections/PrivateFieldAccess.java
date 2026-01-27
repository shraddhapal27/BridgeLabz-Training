package com.reflections;

import java.lang.reflect.Field;

class Person {
    private int age;
    private String name;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name + " (age: " + age + ")";
    }
}

public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Alice", 25);
        System.out.println("Original: " + person);
        
        // Get private field
        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);
        
        // Read private field
        int age = ageField.getInt(person);
        System.out.println("Current age via reflection: " + age);
        
        // Modify private field
        ageField.setInt(person, 30);
        System.out.println("After modification: " + person);
    }
}
