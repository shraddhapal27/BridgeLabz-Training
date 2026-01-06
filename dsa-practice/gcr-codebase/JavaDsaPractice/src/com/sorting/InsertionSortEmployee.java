package com.sorting;

class InsertionSortEmployee {
    public static void main(String[] args) {
        int[] empIds = {105, 102, 110, 101, 108};

        // Insertion Sort
        for (int i = 1; i < empIds.length; i++) {
            int key = empIds[i];
            int j = i - 1;

            // Shift elements of sorted part
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            // Insert key at correct position
            empIds[j + 1] = key;
        }

        // Print sorted employee IDs
        System.out.println("Sorted Employee IDs (Ascending):");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}
