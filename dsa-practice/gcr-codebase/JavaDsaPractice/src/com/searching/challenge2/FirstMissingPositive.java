package com.searching.challenge2;

import java.util.Arrays;

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Ignore numbers <=0 or > n
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

        // Step 2: Mark numbers present
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num <= n) {
                arr[num - 1] = -Math.abs(arr[num - 1]);
            }
        }

        // Step 3: Find first positive index
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        // Step 4: All numbers 1..n are present
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};

        int missing = firstMissingPositive(arr);
        System.out.println("First missing positive: " + missing);
    }
}
