package com.problem1;


public class Faculty extends User {
    public Faculty(String name) {
        super(name);
    }

    public int getBorrowLimit() {
        return 30;
    }
}