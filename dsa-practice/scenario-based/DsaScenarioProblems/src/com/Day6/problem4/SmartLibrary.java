package com.Day6.problem4;

class SmartLibrary {

    static void insertionSort(String[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            String key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].compareTo(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    static void display(String[] books) {
        for (String book : books) {
            System.out.print(book + " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] borrowedBooks = {
            "Algorithms",
            "Data Structures",
            "Java Programming",
            "Computer Networks"
        };

        System.out.println("Before Sorting:");
        display(borrowedBooks);

        insertionSort(borrowedBooks);

        System.out.println("After Sorting:");
        display(borrowedBooks);
    }
}

