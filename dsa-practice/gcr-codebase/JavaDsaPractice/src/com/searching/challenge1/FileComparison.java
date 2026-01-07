package com.searching.challenge1;

import java.io.*;

import java.io.*;

public class FileComparison {
    public static void main(String[] args) {

        String filePath = "largefile.txt"; // ~100MB file

        try {
            // ---------- Using FileReader ----------
            long startFR = System.nanoTime();
            int countFR = countWordsFileReader(filePath);
            long endFR = System.nanoTime();

            System.out.println("FileReader Word Count: " + countFR);
            System.out.println("FileReader Time (ms): " + (endFR - startFR)/1_000_000);

            // ---------- Using InputStreamReader ----------
            long startISR = System.nanoTime();
            int countISR = countWordsInputStreamReader(filePath);
            long endISR = System.nanoTime();

            System.out.println("InputStreamReader Word Count: " + countISR);
            System.out.println("InputStreamReader Time (ms): " + (endISR - startISR)/1_000_000);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }

    // ---------- Method using FileReader ----------
    static int countWordsFileReader(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        int wordCount = 0;

        while ((line = br.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }

        br.close();
        return wordCount;
    }

    // ---------- Method using InputStreamReader ----------
    static int countWordsInputStreamReader(String path) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), "UTF-8"));
        String line;
        int wordCount = 0;

        while ((line = br.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }

        br.close();
        return wordCount;
    }
}

