package com.Day8.problem3;

import java.util.*;
class Course {
    private String title;
    private Instructor instructor;
    private double rating;        // Encapsulated
    private String[] modules;
    private final List<String> reviews = new ArrayList<>(); // read-only externally

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Intro", "Basics", "Advanced"};
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    // Encapsulated rating logic
    protected void updateRating(int score) {
        rating = (rating + score) / 2; // operator usage
    }

    public double getRating() {
        return rating;
    }

    // Read-only access
    public List<String> getReviews() {
        return Collections.unmodifiableList(reviews);
    }

    public int totalModules() {
        return modules.length;
    }

    public String getTitle() {
        return title;
    }
}
