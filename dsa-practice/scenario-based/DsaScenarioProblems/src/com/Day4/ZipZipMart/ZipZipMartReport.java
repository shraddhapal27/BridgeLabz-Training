package com.Day4.ZipZipMart;

import java.util.ArrayList;
public class ZipZipMartReport {

    // Merge Sort function
    public static void mergeSort(ArrayList<Transaction> list) {

        if (list.size() <= 1)
            return;

        int mid = list.size() / 2;

        ArrayList<Transaction> left = new ArrayList<>();
        ArrayList<Transaction> right = new ArrayList<>();

        // Divide
        for (int i = 0; i < mid; i++)
            left.add(list.get(i));

        for (int i = mid; i < list.size(); i++)
            right.add(list.get(i));

        // Recursive calls
        mergeSort(left);
        mergeSort(right);

        // Merge
        merge(list, left, right);
    }

    // Merge two sorted lists
    public static void merge(ArrayList<Transaction> result,
                             ArrayList<Transaction> left,
                             ArrayList<Transaction> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {

            Transaction t1 = left.get(i);
            Transaction t2 = right.get(j);

            // Compare by date
            int dateCompare = t1.date.compareTo(t2.date);

            if (dateCompare < 0) {
                result.set(k++, t1);
                i++;
            }
            else if (dateCompare > 0) {
                result.set(k++, t2);
                j++;
            }
            else {
                // If date same, compare amount
                if (t1.amount <= t2.amount) {
                    result.set(k++, t1); // stable
                    i++;
                } else {
                    result.set(k++, t2);
                    j++;
                }
            }
        }

        // Copy remaining elements
        while (i < left.size())
            result.set(k++, left.get(i++));

        while (j < right.size())
            result.set(k++, right.get(j++));
    }

    // Main method
    public static void main(String[] args) {

        ArrayList<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction(101, "2026-01-12", 450.0));
        transactions.add(new Transaction(102, "2026-01-10", 1200.0));
        transactions.add(new Transaction(103, "2026-01-12", 300.0));
        transactions.add(new Transaction(104, "2026-01-11", 700.0));
        transactions.add(new Transaction(105, "2026-01-10", 1200.0));

        System.out.println("Before Sorting:");
        for (Transaction t : transactions)
            t.display();

        mergeSort(transactions);

        System.out.println("\nAfter Sorting (By Date & Amount):");
        for (Transaction t : transactions)
            t.display();
    }
}