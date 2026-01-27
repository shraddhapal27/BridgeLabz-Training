package com.CSV.question12;

import java.io.*;
import java.util.*;

public class DetectDuplicates {
    public static void main(String[] args) throws Exception {

        Set<String> ids = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String id = line.split(",")[0];
            if (!ids.add(id)) {
                System.out.println("Duplicate Record: " + line);
            }
        }
    }
}

