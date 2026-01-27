package com.reflections;

import java.lang.reflect.Constructor;

class Student {
    private String name;
    private int id;
    
    public Student() {}
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        // Method 1: Default constructor
        Class<?> studentClass = Class.forName("Student");
        Object student1 = studentClass.getDeclaredConstructor().newInstance();
        
        // Method 2: Parameterized constructor
        Constructor<?> constructor = studentClass.getConstructor(String.class, int.class);
        Object student2 = constructor.newInstance("Bob", 123);
        
        System.out.println("Default: " + student1);
        System.out.println("Parameterized: " + student2);
    }
}
