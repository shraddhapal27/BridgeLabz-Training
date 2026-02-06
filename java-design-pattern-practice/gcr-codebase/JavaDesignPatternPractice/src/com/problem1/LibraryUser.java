package com.problem1;

public class LibraryUser implements Observer {

    private String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    @Override
    public void update(Book book) {
        System.out.println("Notification for " + name +
                ": Book available - " + book.getTitle());
    }
}
