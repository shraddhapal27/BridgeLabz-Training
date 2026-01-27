package com.CSV.question2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {

        String file = "C:\\Java Workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOstreamPractice\\src\\main\\java\\com\\CSV\\question2\\employees.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            bw.write("ID,Name,Department,Salary\n");
            bw.write("1,Amit,IT,50000\n");
            bw.write("2,Riya,HR,45000\n");
            bw.write("3,Karan,Finance,60000\n");
            bw.write("4,Neha,IT,70000\n");
            bw.write("5,Arjun,Sales,48000\n");

            System.out.println("CSV file created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
