package com.Day1.feedbackguru;

package com.Day1.feedbackguru;

import java.util.Scanner;
import java.util.*;  // ← ENSURE THESE

public class FeedbackGuruDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FeedbackGuruManager manager = new FeedbackGuruManager();
        int choice = -1;

        System.out.println(" Welcome to FeedbackGuru - Smart Survey Analyzer!");

        while (choice != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Process feedback files");
            System.out.println("2. Display categorized feedback");
            System.out.println("3. Clear all data");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            String input = sc.nextLine();

            try {
                choice = Integer.parseInt(input.trim());  // ← TRIM ADDED
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input! Enter a number (0-3).");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Folder path (.txt files): ");
                    String folder = sc.nextLine().trim();
                    System.out.print("Feedback type: ");
                    String type = sc.nextLine().trim();
                    manager.processFeedbackFolder(folder, type);
                    break;  // ✅ THIS IS CORRECT

                case 2:
                    ((Object) manager).displayCategorizedFeedback();  // ✅ THIS WORKS
                    break;  // ✅ THIS IS CORRECT

                case 3:
                    manager.clearData();
                    System.out.println("✅ All data cleared!");
                    break;  // ✅ THIS IS CORRECT

                case 0:
                    System.out.println("👋 Goodbye!");
                    break;  // ✅ EXIT

                default:
                    System.out.println("❌ Invalid choice! Use 0-3.");
            }
        }
        sc.close();
    }
}
