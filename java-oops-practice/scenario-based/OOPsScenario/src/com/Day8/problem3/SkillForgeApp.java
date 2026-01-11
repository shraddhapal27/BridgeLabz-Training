package com.Day8.problem3;

import java.util.Scanner;

public class SkillForgeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Instructor Input --------
        System.out.print("Enter Instructor Name: ");
        String instructorName = sc.nextLine();

        System.out.print("Enter Instructor Email: ");
        String instructorEmail = sc.nextLine();

        Instructor instructor = new Instructor(instructorName, instructorEmail);

        // -------- Course Input --------
        System.out.print("Enter Course Title: ");
        String courseTitle = sc.nextLine();

        System.out.print("Enter Number of Modules: ");
        int moduleCount = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] modules = new String[moduleCount];
        for (int i = 0; i < moduleCount; i++) {
            System.out.print("Enter Module " + (i + 1) + ": ");
            modules[i] = sc.nextLine();
        }

        Course course = new Course(courseTitle, instructor, modules);

        // -------- Student Input --------
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student Email: ");
        String studentEmail = sc.nextLine();

        Student student = new Student(studentName, studentEmail);

        // -------- Progress Input --------
        System.out.print("Enter Completed Modules: ");
        int completed = sc.nextInt();

        student.updateProgress(completed, course.totalModules());

        // -------- Output --------
        System.out.println("\n===== SkillForge Summary =====");
        System.out.println("Course: " + course.getTitle());
        System.out.println("Instructor: " + instructorName);
        System.out.println("Student: " + studentName);
        System.out.println("Progress: " + student.getProgress() + "%");

        System.out.println("\nCertificate Status:");
        student.generateCertificate(); // Polymorphism

        sc.close();
    }
}
