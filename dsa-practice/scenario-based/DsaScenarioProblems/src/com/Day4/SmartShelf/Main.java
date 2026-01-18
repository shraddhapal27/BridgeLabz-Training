package com.Day4.SmartShelf;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void insertionSort(ArrayList<Book> books) {
    	int n = books.size();
    	
    	for(int i=1; i<n; i++) {
    			Book key = books.get(i);
    			int j = i-1;
    			
    			while(j>=0 && books.get(j).title.compareToIgnoreCase(key.title) > 0) {
    				  books.set(j + 1, books.get(j));
    	                j--;
    			}
    			  // Insert key at correct position
                books.set(j + 1, key);
    	}
    }
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         ArrayList<Book> books = new ArrayList<>();

         System.out.print("Enter number of books: ");
         int n = sc.nextInt();
         sc.nextLine(); // consume newline

         for (int i = 0; i < n; i++) {
             System.out.print("Enter book title: ");
             String title = sc.nextLine();
             books.add(new Book(title));
         }

         // Apply Insertion Sort
         insertionSort(books);

         System.out.println("\nSorted Reading List (Alphabetical Order):");
         for (Book b : books) {
             System.out.println(b.title);
         }

         sc.close();
     
    }
}
