package com.Day3.LibraryOrganizer;

import java.util.*;

public class BookShelf {

    // genre → list of books
    private HashMap<String, LinkedList<String>> library = new HashMap<>();

    // optional: avoid duplicate books
    private HashSet<String> uniqueBooks = new HashSet<>();

    // add book
    public void addBook(String genre, String book) {

        // avoid duplication
        if (uniqueBooks.contains(book)) {
            System.out.println(book + " already exists!");
            return;
        }

        library.putIfAbsent(genre, new LinkedList<>());
        library.get(genre).add(book);
        uniqueBooks.add(book);

        System.out.println(book + " added to " + genre);
    }

    // borrow book
    public void borrowBook(String genre, String book) {
        if (library.containsKey(genre) && library.get(genre).remove(book)) {
            uniqueBooks.remove(book);
            System.out.println(book + " borrowed");
        } else {
            System.out.println(book + " not available");
        }
    }

    // display library
    public void display() {
        System.out.println("\nLibrary Catalog:");
        for (String genre : library.keySet()) {
            System.out.println(genre + " → " + library.get(genre));
        }
    }
}
