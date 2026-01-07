package com.searching.binarysearch;

public class RotationPoint {

    public static int findRotationIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                // Smallest element is in the right half
                left = mid + 1;
            } else {
                // Smallest element is in the left half (including mid)
                right = mid;
            }
        }

        // left == right -> smallest element index
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 1, 2, 3, 4, 5};

        int rotationIndex = findRotationIndex(arr);

        System.out.println("Rotation point index: " + rotationIndex);
        System.out.println("Smallest element: " + arr[rotationIndex]);
    }
}
