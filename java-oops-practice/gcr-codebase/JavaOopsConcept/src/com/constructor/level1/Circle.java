package com.constructor.level1;

public class Circle {
  double radius;
  
  // Default constructor
  Circle() {
      this(1.0);   // Calling parameterized constructor
  }

  // 2️⃣ Parameterized Constructor
  Circle(double radius) {
      this.radius = radius;
  }

  // Method to display radius
  void display() {
      System.out.println("Radius: " + radius);
  }
}
