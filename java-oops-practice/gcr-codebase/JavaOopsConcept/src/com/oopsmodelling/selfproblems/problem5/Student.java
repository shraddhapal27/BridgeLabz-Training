package com.oopsmodelling.selfproblems.problem5;

import java.util.ArrayList;

class Student {
    int studentId;
    String studentName;
    ArrayList<Course> courses;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    // Communication method
    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);

        System.out.println(studentName + " enrolled in " + course.courseName);
    }

    void viewCourses() {
        System.out.println("Student: " + studentName);
        for (Course c : courses) {
            System.out.println("Course: " + c.courseName);
        }
        System.out.println();
    }
}

