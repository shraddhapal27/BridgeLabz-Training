package com.Day5.RoboWarehouse;

/*
 RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: A robot loads packages onto shelves based on weight. It adds one package at a time
and must maintain an ascending order by weight for balance. Insertion Sort helps since new
items are inserted into the sorted list dynamically.
Key Concepts:
● Insertion into sorted lists
● Low memory footprint
● Ideal for streaming insertions
 */

public class InsertionSort {
    // Method to insert packages in ascending order of weight
    static void insertionSort(int[] weights) {
        int n = weights.length;

        for (int i = 1; i < n; i++) {
            int currentPackage = weights[i];
            int j = i - 1;

            // Shift heavier packages to the right
            while (j >= 0 && weights[j] > currentPackage) {
                weights[j + 1] = weights[j];
                j--;
            }

            // Insert at correct position
            weights[j + 1] = currentPackage;
        }
    }

    //  display method (instead of Arrays.toString)
    static void displayShelf(int[] weights) {
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + " ");
        }
        System.out.println();
    }

    
    // main method
    public static void main(String[] args) {

        int[] packageWeights = {10, 5, 8, 3};

        System.out.println("Before loading packages:");
        displayShelf(packageWeights);

        // Robot loads packages using insertion sort
        insertionSort(packageWeights);

        System.out.println("After loading packages (Ascending Order):");
        displayShelf(packageWeights);
    }
}
