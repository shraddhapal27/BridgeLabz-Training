package com.oopsmodelling.selfproblems.problem1;

import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("Student: " + s.studentName);
        }
        System.out.println();
    }
}
