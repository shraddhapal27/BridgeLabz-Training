package com.Day1.problem2;

class Library {

    Book[] books;
    int count = 0;

    Library(int size) {
        books = new Book[size];
    }

    void addBook(Book book) {
        books[count++] = book;
    }

    void borrowBook(String title) {
        for (Book book : books) {
            if (book != null && book.title.equals(title) && book.isAvailable()) {
                book.available = false;
                System.out.println("Book borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not available");
    }

    void returnBook(String title) {
        for (Book book : books) {
            if (book != null && book.title.equals(title)) {
                book.available = true;
                System.out.println("Book returned: " + title);
                return;
            }
        }
    }

    void showBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.title + " - " +
                        (book.available ? "Available" : "Not Available"));
            }
        }
    }
}
