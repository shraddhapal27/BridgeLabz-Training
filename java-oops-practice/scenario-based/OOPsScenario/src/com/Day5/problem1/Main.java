package com.Day5.problem1;

public class Main {
    public static void main(String[] args) {

        // Creating Learner
        Learner learner = new Learner(
                "Shraddha",
                "shraddha@gmail.com",
                101
        );

        // Creating Quiz with variable difficulty using constructor
        Quiz quiz = new Quiz("Medium");

        // Learner answers
        String[] userAnswers = {"A", "B", "C", "D", "A"};

        // Calculating score
        quiz.calculateSCore(userAnswers);

        // Display percentage
        System.out.println("Quiz Percentage: " + quiz.getPercentage() + "%");

        // Polymorphism example
        ICertifiable course1 = new ShortTimeC();
        ICertifiable course2 = new LongTimeC();

        course1.generateCertificate();
        course2.generateCertificate();
    }
}
