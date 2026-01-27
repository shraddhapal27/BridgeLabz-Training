package com.CSV.question4;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterStudents {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("src/main/java/com/CSV/question4/students.csv")
        );

        br.readLine(); // skip header

        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            int marks = Integer.parseInt(data[3]);

            if (marks > 80) {
                System.out.println(line);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No student scored more than 80");
        }

        br.close();
    }
}
