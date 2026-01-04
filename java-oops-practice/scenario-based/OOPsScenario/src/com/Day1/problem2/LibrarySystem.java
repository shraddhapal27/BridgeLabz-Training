package com.Day1.problem2;

public class LibrarySystem {
    public static void main(String[] args) {

        Library lib = new Library(3);

        lib.addBook(new Book("Java Basics", "James"));
        lib.addBook(new Book("OOPS Concepts", "Bjarne"));

        lib.showBooks();
        lib.borrowBook("Java Basics");
        lib.showBooks();
        lib.returnBook("Java Basics");
        lib.showBooks();
    }
}

