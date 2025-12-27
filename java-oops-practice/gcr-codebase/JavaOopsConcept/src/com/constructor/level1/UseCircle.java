package com.constructor.level1;

public class UseCircle {
	public static void main(String[] args) {

        // Using default constructor
        Circle c1 = new Circle();
        c1.display();

        // Using parameterized constructor
        Circle c2 = new Circle(5.5);
        c2.display();
    }
}
