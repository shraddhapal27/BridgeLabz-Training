package day05.Hackerrank;

import java.io.*;
import java.util.*;

public class RunningTime
{
        public static int insertionSort(int[] arr) {

            int count = 0;

            for (int i = 1; i < arr.length; i++) {

                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {

                    arr[j + 1] = arr[j];
                    j--;

                    count++;
                }

                arr[j + 1] = key;
            }

            return count;
        }


        public static int quickSort(int[] arr, int start, int end) {

            if (start >= end) {
                return 0;
            }

            int count = 0;

            int pivot = arr[end];

            int i = start - 1;

            for (int j = start; j < end; j++) {

                if (arr[j] < pivot) {

                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    count++;
                }
            }

            // Move pivot into correct position
            i++;

            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;

            count++;

            // Sort left and right
            count += quickSort(arr, start, i - 1);
            count += quickSort(arr, i + 1, end);

            return count;
        }


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for (int i = 0; i < n; i++) {

                int value = sc.nextInt();

                arr1[i] = value;
                arr2[i] = value;
            }

            int insertionShifts = insertionSort(arr1);

            int quickSortSwaps = quickSort(arr2, 0, n - 1);

            System.out.println(insertionShifts - quickSortSwaps);
        }
    }
