package com.problem1;

public class Librarian extends User {
    public Librarian(String name) {
        super(name);
    }

    public int getBorrowLimit() {
        return Integer.MAX_VALUE;
    }
}