package com.inheritance.multilevelinheritance.problem2;

public class EducationalCourseSystem {
    public static void main(String[] args) {

        Course c1 = new Course("Java Basics", 6);
        OnlineCourse c2 = new OnlineCourse("Web Development", 8, "Coursera", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse(
                "Advanced Java",
                10,
                "Udemy",
                true,
                5000,
                20
        );

        c1.displayDetails();
        System.out.println();

        c2.displayDetails();
        System.out.println();

        c3.displayDetails();
    }
}
