package com.searching.linearsearch;

public class FirstNegativeLinearSearch {

    // Method to find the first negative number
    public static int firstNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // first negative found
            }
        }
        return -1; // no negative number found
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, -2, 9, -5};

        int index = firstNegativeIndex(arr);

        if (index != -1) {
            System.out.println("First negative number: " + arr[index] + " at index " + index);
        } else {
            System.out.println("No negative number found.");
        }
    }
}
