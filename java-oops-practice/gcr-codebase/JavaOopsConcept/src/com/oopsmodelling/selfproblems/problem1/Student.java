package com.oopsmodelling.selfproblems.problem1;

import java.util.ArrayList;

class Student {
    String studentName;
    ArrayList<Course> courses;

    Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    // Association method
    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // bidirectional association
    }

    void viewCourses() {
        System.out.println("Student: " + studentName);
        for (Course c : courses) {
            System.out.println("Enrolled in: " + c.courseName);
        }
        System.out.println();
    }
}
