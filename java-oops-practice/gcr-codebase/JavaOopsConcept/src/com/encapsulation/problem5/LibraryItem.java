package com.encapsulation.problem5;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean available = true;
    private String borrowerName; // encapsulated personal data

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation (controlled access)
    public boolean isAvailable() {
        return available;
    }

    protected void setBorrower(String borrowerName) {
        this.borrowerName = borrowerName;
        this.available = false;
    }

    protected void returnItem() {
        this.borrowerName = null;
        this.available = true;
    }

    // Abstract method
    abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }
}
