package com.Day2.problem3;

abstract class Student implements Graded {

    protected int studentId;
    protected String name;

    private double totalGradePoints = 0;
    private int totalCredits = 0;

    // Constructor without electives
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Constructor with elective preference
    public Student(int studentId, String name, String elective) {
        this(studentId, name);
        System.out.println("Elective chosen: " + elective);
    }

    // Encapsulation: GPA calculation hidden
    protected void addGrade(double gradePoint, int credits) {
        totalGradePoints += gradePoint * credits;
        totalCredits += credits;
    }

    public double getGPA() {
        return totalCredits == 0 ? 0 : totalGradePoints / totalCredits;
    }

    public void viewTranscript() {
        System.out.println("Student: " + name);
        System.out.println("GPA: " + getGPA());
    }
}

