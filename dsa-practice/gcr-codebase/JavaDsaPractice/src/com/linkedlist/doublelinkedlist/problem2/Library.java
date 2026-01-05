package com.linkedlist.doublelinkedlist.problem2;


class Library {
    BookNode head = null;
    BookNode tail = null;

    // Add at Beginning
    void addAtBeginning(BookNode newBook) {
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add at End
    void addAtEnd(BookNode newBook) {
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add at Position
    void addAtPosition(BookNode newBook, int pos) {
        if (pos <= 1) {
            addAtBeginning(newBook);
            return;
        }

        BookNode temp = head;
        int count = 1;

        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(newBook);
        } else {
            newBook.next = temp.next;
            newBook.prev = temp;
            temp.next.prev = newBook;
            temp.next = newBook;
        }
    }

    // Remove by Book ID
    void removeById(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) {
                    head = head.next;
                    if (head != null)
                        head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Book removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Search by Title or Author
    void search(String key) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(key) || temp.author.equalsIgnoreCase(key)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No matching book found.");
    }

    // Update Availability
    void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Display Forward
    void displayForward() {
        BookNode temp = head;
        if (temp == null) {
            System.out.println("Library is empty.");
            return;
        }
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display Reverse
    void displayReverse() {
        BookNode temp = tail;
        if (temp == null) {
            System.out.println("Library is empty.");
            return;
        }
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count Books
    void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books: " + count);
    }

    void displayBook(BookNode b) {
        System.out.println("ID: " + b.bookId +
                ", Title: " + b.title +
                ", Author: " + b.author +
                ", Genre: " + b.genre +
                ", Available: " + b.isAvailable);
    }
}
