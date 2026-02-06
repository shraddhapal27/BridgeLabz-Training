package com.problem1;

public class LibraryDemo {

    public static void main(String[] args) {

        // Singleton Catalog
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Factory Users
        User student = UserFactory.createUser("student", "Alice");
        User faculty = UserFactory.createUser("faculty", "Dr. Smith");

        // Observer users
        LibraryUser observer1 = new LibraryUser("Alice");
        LibraryUser observer2 = new LibraryUser("Dr. Smith");

        catalog.registerObserver(observer1);
        catalog.registerObserver(observer2);

        // Builder Book
        Book dsBook = new Book.BookBuilder("Data Structures by Cormen")
                .addAuthor("Thomas H. Cormen")
                .edition("3rd Edition")
                .genre("Computer Science")
                .publisher("MIT Press")
                .build();

        // Adding book triggers notification
        catalog.addBook(dsBook);
    }
}
