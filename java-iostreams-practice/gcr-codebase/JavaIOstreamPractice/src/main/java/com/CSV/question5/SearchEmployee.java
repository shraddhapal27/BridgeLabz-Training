package com.CSV.question5;

import java.io.BufferedReader;
import java.io.FileReader;

public class SearchEmployee {
    public static void main(String[] args) throws Exception {

        String searchName = "Neha";

        BufferedReader br = new BufferedReader(new FileReader("C:\\\\Java Workspace\\\\java-iostreams-practice\\\\gcr-codebase\\\\JavaIOstreamPractice\\\\src\\\\main\\\\java\\\\com\\\\CSV\\\\question2\\\\employees.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (data[1].equalsIgnoreCase(searchName)) {
                System.out.println("Department: " + data[2]);
                System.out.println("Salary: " + data[3]);
            }
        }
        br.close();
    }
}

