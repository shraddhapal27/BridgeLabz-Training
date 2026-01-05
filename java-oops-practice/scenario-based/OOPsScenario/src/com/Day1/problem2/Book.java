package com.Day1.problem2;

class Book {
    String title;
    String author;
    boolean available = true;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    boolean isAvailable() {
        return available;
    }
}
