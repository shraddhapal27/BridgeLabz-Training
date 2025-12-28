package com.constructor.level1;

class EBook extends Book2 {

    double fileSize; // in MB

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void displayDetails() {
        System.out.println("ISBN       : " + ISBN);       // public
        System.out.println("Title      : " + title);      // protected
        System.out.println("Author     : " + getAuthor()); // private via method
        System.out.println("File Size  : " + fileSize + " MB");
    }
}

