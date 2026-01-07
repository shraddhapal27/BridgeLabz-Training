package com.searching.binarysearch;

public class PeakElement {

    public static int findPeak(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check neighbors safely
            int leftNeighbor = (mid == 0) ? Integer.MIN_VALUE : arr[mid - 1];
            int rightNeighbor = (mid == n - 1) ? Integer.MIN_VALUE : arr[mid + 1];

            if (arr[mid] > leftNeighbor && arr[mid] > rightNeighbor) {
                // Peak element found
                return mid;
            } else if (arr[mid] < leftNeighbor) {
                // Move left
                right = mid - 1;
            } else {
                // Move right
                left = mid + 1;
            }
        }

        return -1; // This will never happen in a valid array
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeak(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element: " + arr[peakIndex]);
    }
}
