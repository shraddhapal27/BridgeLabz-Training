package com.Day11.problem1;

import java.util.*;

public class LineComparisonApp {

    // Method to compare two lines
    public static void compareLines(Line l1, Line l2) {

        double length1 = l1.calculateLength();
        double length2 = l2.calculateLength();

        System.out.println("Line 1 Length: " + length1);
        System.out.println("Line 2 Length: " + length2);

        if (length1 == length2) {
            System.out.println("Both lines are equal in length.");
        } else if (length1 > length2) {
            System.out.println("Line 1 is longer.");
        } else {
            System.out.println("Line 2 is longer.");
        }
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Line> lines = new ArrayList<>();

        System.out.println("Enter number of lines:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter coordinates for Line " + i + " (x1 y1 x2 y2):");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            lines.add(new Line(x1, y1, x2, y2));
        }

        // Compare lines pairwise
        for (int i = 0; i < lines.size() - 1; i++) {
            compareLines(lines.get(i), lines.get(i + 1));
        }

        sc.close();
    }
}
