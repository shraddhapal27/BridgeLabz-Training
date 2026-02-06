package com.problem1;

public abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public abstract int getBorrowLimit();
}
