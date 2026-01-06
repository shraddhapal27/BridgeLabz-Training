package com.sorting;

class SelectionSortExamScores {
    public static void main(String[] args) {
        int[] scores = {72, 88, 65, 90, 78};

        // Selection Sort
        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;

            // Find minimum in unsorted part
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        // Print sorted exam scores
        System.out.println("Sorted Exam Scores (Ascending):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}

