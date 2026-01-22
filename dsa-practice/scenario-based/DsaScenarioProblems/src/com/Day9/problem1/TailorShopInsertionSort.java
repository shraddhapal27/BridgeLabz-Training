package com.Day9.problem1;

class TailorShopInsertionSort {

    static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // shift larger deadlines to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // insert order at correct deadline
        }
    }

    public static void main(String[] args) {

        int deadlines[] = {2, 4, 6, 5};

        insertionSort(deadlines);

        System.out.println("Sorted Orders by Deadline:");
        for (int d : deadlines)
            System.out.print(d + " ");
    }
}
