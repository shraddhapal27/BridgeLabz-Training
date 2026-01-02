package com.encapsulation.problem5;

import java.util.ArrayList;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        ArrayList<LibraryItem> items = new ArrayList<>();

        LibraryItem b1 = new Book(1, "Java Basics", "James Gosling");
        LibraryItem m1 = new Magazine(2, "Tech Monthly", "Editorial Team");
        LibraryItem d1 = new DVD(3, "OOPS Concepts", "Oracle");

        items.add(b1);
        items.add(m1);
        items.add(d1);

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
            }

            System.out.println("------------------------");
        }
    }
}

