package com.constructor.level1;

public class UseBook2 {
    public static void main(String[] args) {

        EBook ebook = new EBook(
                "978-0135166307",
                "Effective Java",
                "Joshua Bloch",
                5.2
        );

        ebook.displayDetails();

        // Updating author using setter
        ebook.setAuthor("J. Bloch");

        System.out.println("\nAfter Updating Author:");
        System.out.println("Author : " + ebook.getAuthor());
    }
}
