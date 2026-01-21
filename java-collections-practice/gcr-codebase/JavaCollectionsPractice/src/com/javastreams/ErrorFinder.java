package com.javastreams;

import java.io.*;

public class ErrorFinder {
    public static void main(String[] args) {

        try (BufferedReader br =
                     new BufferedReader(new FileReader("log.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check file location.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

