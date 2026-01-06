package com.sorting;

import java.util.*;

class CountingSortStudentAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];

        // Step 1: Count frequency
        for (int age : ages) {
            if (age < minAge || age > maxAge) {
                System.out.println("Invalid age detected: " + age);
                return;
            }
            count[age - minAge]++;
        }

        // Step 2: Reconstruct sorted array
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                ages[index++] = i + minAge;
                count[i]--;
            }
        }

        // Output
        System.out.println("Sorted Student Ages (Ascending):");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}

