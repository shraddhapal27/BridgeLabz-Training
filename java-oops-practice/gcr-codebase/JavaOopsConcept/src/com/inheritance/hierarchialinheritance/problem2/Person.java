package com.inheritance.hierarchialinheritance.problem2;

//Superclass
class Person {
 String name;
 int age;

 // Constructor
 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 void displayDetails() {
     System.out.println("Name : " + name);
     System.out.println("Age  : " + age);
 }

 // Method to be overridden
 void displayRole() {
     System.out.println("Role : Person");
 }
}
