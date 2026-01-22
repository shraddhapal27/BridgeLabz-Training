package com.Day8.problem1;
public class ScoresOrdering{

    public static void quickSort(Player[] players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);
            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    private static int partition(Player[] players, int low, int high) {
        int pivot = players[high].getScore(); // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // DESCENDING order (higher score first)
            if (players[j].getScore() > pivot) {
                i++;
                swap(players, i, j);
            }
        }

        swap(players, i + 1, high);
        return i + 1;
    }

    private static void swap(Player[] players, int i, int j) {
        Player temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    } 
}

