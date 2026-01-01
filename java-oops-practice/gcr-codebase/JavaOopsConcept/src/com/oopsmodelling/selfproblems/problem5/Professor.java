package com.oopsmodelling.selfproblems.problem5;

import java.util.ArrayList;

class Professor {
    int profId;
    String profName;
    ArrayList<Course> courses;

    Professor(int profId, String profName) {
        this.profId = profId;
        this.profName = profName;
        this.courses = new ArrayList<>();
    }

    // Communication method
    void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);

        System.out.println(profName + " assigned to teach " + course.courseName);
    }

    void viewCourses() {
        System.out.println("Professor: " + profName);
        for (Course c : courses) {
            System.out.println("Teaching: " + c.courseName);
        }
        System.out.println();
    }
}

