package com.oopsmodelling.selfproblems.problem5;

import java.util.ArrayList;

class Course {
    int courseId;
    String courseName;
    Professor professor;
    ArrayList<Student> students;

    Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName);

        if (professor != null) {
            System.out.println("Professor: " + professor.profName);
        }

        System.out.println("Students Enrolled:");
        for (Student s : students) {
            System.out.println("- " + s.studentName);
        }
        System.out.println();
    }
}

