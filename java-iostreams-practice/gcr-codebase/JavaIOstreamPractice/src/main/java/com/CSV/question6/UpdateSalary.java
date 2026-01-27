package com.CSV.question6;

import java.io.*;

public class UpdateSalary {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("C:\\\\Java Workspace\\\\java-iostreams-practice\\\\gcr-codebase\\\\JavaIOstreamPractice\\\\src\\\\main\\\\java\\\\com\\\\CSV\\\\question2\\\\employees.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("updated_employees.csv"));

        bw.write(br.readLine() + "\n"); // header

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");

            if (d[2].equals("IT")) {
                double salary = Double.parseDouble(d[3]);
                d[3] = String.valueOf(salary * 1.10);
            }

            bw.write(String.join(",", d) + "\n");
        }

        br.close();
        bw.close();
    }
}

