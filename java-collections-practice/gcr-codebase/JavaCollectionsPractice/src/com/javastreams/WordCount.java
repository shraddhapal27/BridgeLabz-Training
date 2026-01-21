package com.javastreams;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader("text.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.toLowerCase().split("\\W+")) {
                    if (!word.isEmpty())
                        map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("text.txt file not found. Check location.");
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        map.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(5)
                .forEach(e ->
                        System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
