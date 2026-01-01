package com.oopsmodelling.assisstedproblems.problem1;

public class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

