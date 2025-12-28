package com.constructor.level1;

public class UseStuden {
	public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(
                101, "Shraddha", 8.6, "Computer Science");

        pg.displayDetails();

        // Modifying CGPA using public method
        pg.setCGPA(9.1);

        System.out.println("\nAfter CGPA Update:");
        System.out.println("Updated CGPA : " + pg.getCGPA());
    }
}
