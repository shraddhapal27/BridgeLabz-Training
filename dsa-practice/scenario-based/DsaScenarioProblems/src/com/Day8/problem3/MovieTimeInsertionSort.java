package com.Day8.problem3;

class MovieTimeInsertionSort {

    static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // shift larger elements to right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;   // insert at correct position
        }
    }

    public static void main(String[] args) {

        int showTimes[] = {600, 720, 840, 780};

        insertionSort(showTimes);

        System.out.println("Sorted Show Timings:");
        for (int time : showTimes)
            System.out.print(time + " ");
    }
}

