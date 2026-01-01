package com.oopsmodelling.selfproblems.problem5;

public class UseUniversity {
    public static void main(String[] args) {

        University uni = new University("Global Tech University");

        Student s1 = new Student(1, "Aarav");
        Student s2 = new Student(2, "Priya");

        Professor p1 = new Professor(101, "Dr. Sharma");
        Professor p2 = new Professor(102, "Dr. Mehta");

        Course c1 = new Course(501, "Java Programming");
        Course c2 = new Course(502, "Data Structures");

        // Aggregation
        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addProfessor(p2);
        uni.addCourse(c1);
        uni.addCourse(c2);

        uni.showUniversityDetails();

        // Association + Communication
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s2.enrollCourse(c2);

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        // View details
        s1.viewCourses();
        s2.viewCourses();

        p1.viewCourses();
        p2.viewCourses();

        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}
