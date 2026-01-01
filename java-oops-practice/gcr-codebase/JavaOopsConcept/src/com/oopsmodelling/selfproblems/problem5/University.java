package com.oopsmodelling.selfproblems.problem5;

import java.util.ArrayList;

class University {
    String universityName;
    ArrayList<Student> students;
    ArrayList<Professor> professors;
    ArrayList<Course> courses;

    University(String universityName) {
        this.universityName = universityName;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void addProfessor(Professor professor) {
        professors.add(professor);
    }

    void addCourse(Course course) {
        courses.add(course);
    }

    void showUniversityDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Students: " + students.size());
        System.out.println("Professors: " + professors.size());
        System.out.println("Courses: " + courses.size());
        System.out.println();
    }
}

