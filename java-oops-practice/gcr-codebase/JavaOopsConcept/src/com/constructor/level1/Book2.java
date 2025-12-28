package com.constructor.level1;

class Book2 {

    // Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Constructor
    Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for author (private variable)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author (private variable)
    public String getAuthor() {
        return author;
    }
}
