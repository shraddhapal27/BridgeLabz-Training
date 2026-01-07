package com.searching.challenge2;

import java.util.Arrays;

public class BinarySearchTarget {

    // Binary Search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        int target = 4;

        // Sort the array before binary search
        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}
