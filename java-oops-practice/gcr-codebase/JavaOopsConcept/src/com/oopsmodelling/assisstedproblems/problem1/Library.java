package com.oopsmodelling.assisstedproblems.problem1;

import java.util.ArrayList;

public class Library {
    String libraryName;
    ArrayList<Book> books;

    // Constructor
    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    // Add book to library
    void addBook(Book book) {
        books.add(book);
    }

    // Display library books
    void showBooks() {
        System.out.println("Library: " + libraryName);
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println();
    }
}
