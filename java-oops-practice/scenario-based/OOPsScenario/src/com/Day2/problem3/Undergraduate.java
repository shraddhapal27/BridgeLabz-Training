package com.Day2.problem3;

class Undergraduate extends Student {

    private Course course;

    public Undergraduate(int id, String name, Course course) {
        super(id, name);
        this.course = course;
    }

    @Override
    public void assignGrade(double marks) {
        double gradePoint;

        if (marks >= 90) gradePoint = 10;
        else if (marks >= 80) gradePoint = 8;
        else if (marks >= 70) gradePoint = 7;
        else if (marks >= 60) gradePoint = 6;
        else gradePoint = 0;

        addGrade(gradePoint, course.getCredits());
    }
}

