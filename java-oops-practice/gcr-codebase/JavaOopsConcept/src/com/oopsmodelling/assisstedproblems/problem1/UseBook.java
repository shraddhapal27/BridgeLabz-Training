package com.oopsmodelling.assisstedproblems.problem1;

public class UseBook {
    public static void main(String[] args) {

        // Creating Book objects (independent)
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Python Basics", "Guido van Rossum");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Creating Library objects
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Adding books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // Same book in another library
        lib2.addBook(b3);

        // Display books
        lib1.showBooks();
        lib2.showBooks();
    }
}

