package com.Day9.problem2;

import java.util.Scanner;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of categories
        System.out.print("Enter number of categories: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] categories = new String[n];
        double[] limits = new double[n];

        // Input categories and limits
        for (int i = 0; i < n; i++) {
            System.out.print("Enter category name: ");
            categories[i] = sc.nextLine();

            System.out.print("Enter limit for " + categories[i] + ": ");
            limits[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Income and budget limit
        System.out.print("Enter monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Enter overall budget limit: ");
        double budgetLimit = sc.nextDouble();
        sc.nextLine();

        Budget budget = new MonthlyBudget(income, budgetLimit, categories, limits);

        // Transactions
        System.out.print("Enter number of transactions: ");
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            System.out.println("\nTransaction " + (i + 1));

            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Type (income/expense): ");
            String type = sc.nextLine();

            System.out.print("Date (dd-mm-yy): ");
            String date = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            budget.addTransaction(new Transaction(amount, type, date, category));
        }

        // Polymorphic calls
        System.out.println("\n----- REPORT -----");
        budget.generateReport();
        budget.detectOverspend();

        sc.close();
    }
}
