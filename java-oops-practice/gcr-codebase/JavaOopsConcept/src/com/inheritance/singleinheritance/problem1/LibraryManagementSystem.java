package com.inheritance.singleinheritance.problem1;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Author book1 = new Author(
                "Clean Code",
                2008,
                "Robert C. Martin",
                "Software engineer and author"
        );

        book1.displayInfo();
    }
}
