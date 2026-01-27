package com.CSV.question11;

import java.io.*;
import java.util.*;

public class ReadLargeCSV {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("large.csv"));
        br.readLine();

        int count = 0;
        List<String> chunk = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            chunk.add(line);

            if (chunk.size() == 100) {
                count += chunk.size();
                System.out.println("Processed records: " + count);
                chunk.clear();
            }
        }
        br.close();
    }
}
