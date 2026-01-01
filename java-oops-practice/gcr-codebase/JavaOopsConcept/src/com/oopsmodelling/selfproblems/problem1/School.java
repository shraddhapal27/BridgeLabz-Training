package com.oopsmodelling.selfproblems.problem1;

import java.util.ArrayList;

class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("Student: " + s.studentName);
        }
        System.out.println();
    }
}

