package com.CSV.question3;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountCSVRows {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("C:\\\\Java Workspace\\\\java-iostreams-practice\\\\gcr-codebase\\\\JavaIOstreamPractice\\\\src\\\\main\\\\java\\\\com\\\\CSV\\\\question2\\\\employees.csv"));
        br.readLine(); // skip header

        int count = 0;
        while (br.readLine() != null) {
            count++;
        }

        System.out.println("Total Records = " + count);
        br.close();
    }
}
