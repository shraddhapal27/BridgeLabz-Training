package com.oopsmodelling.selfproblems.problem1;

public class UseSchool{
    public static void main(String[] args) {

        // Create School
        School school = new School("Green Valley School");

        // Create Students
        Student s1 = new Student("Aarav");
        Student s2 = new Student("Priya");

        // Create Courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        // Aggregation: School has students
        school.addStudent(s1);
        school.addStudent(s2);

        // Association: Students enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);

        // Display details
        school.showStudents();

        s1.viewCourses();
        s2.viewCourses();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}
