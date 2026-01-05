package com.Day2.problem3;

public class UniversitySystem {

    public static void main(String[] args) {

        Course java = new Course("CS101", "Core Java", 4);

        Student s1 = new Undergraduate(1, "Amit", java);
        Student s2 = new Postgraduate(2, "Neha", java, "AI");

        Faculty f1 = new Faculty("Dr. Sharma");

        Enrollment e1 = new Enrollment(s1, java);
        Enrollment e2 = new Enrollment(s2, java);

        f1.gradeStudent(s1, 85); // letter grading
        f1.gradeStudent(s2, 55); // pass/fail grading

        s1.viewTranscript();
        s2.viewTranscript();
    }
}

