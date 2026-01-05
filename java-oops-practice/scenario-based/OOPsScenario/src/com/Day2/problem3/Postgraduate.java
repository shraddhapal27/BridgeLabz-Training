package com.Day2.problem3;

class Postgraduate extends Student {

    private Course course;

    public Postgraduate(int id, String name, Course course, String elective) {
        super(id, name, elective);
        this.course = course;
    }

    @Override
    public void assignGrade(double marks) {
        double gradePoint = (marks >= 50) ? 8 : 0;
        addGrade(gradePoint, course.getCredits());
    }
}
