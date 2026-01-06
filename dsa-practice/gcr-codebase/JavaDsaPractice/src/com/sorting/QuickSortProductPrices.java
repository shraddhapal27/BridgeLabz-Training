package com.sorting;

class QuickSortProductPrices {

    // Quick Sort function
    static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Sort left and right subarrays
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method
    static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // swap
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {1200, 450, 800, 299, 999};

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices (Ascending):");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}

