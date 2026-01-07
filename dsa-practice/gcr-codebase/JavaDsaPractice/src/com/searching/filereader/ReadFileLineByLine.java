package com.searching.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // closes BufferedReader and FileReader
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
