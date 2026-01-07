package com.searching.imputstreamreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleToFile {
    public static void main(String[] args) {

        try {
            // Read from console
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            // Write to file
            FileWriter fw = new FileWriter("output.txt");

            System.out.println("Enter text (type 'exit' to stop):");

            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(line + "\n");
            }

            fw.close();
            br.close();

            System.out.println("Input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
