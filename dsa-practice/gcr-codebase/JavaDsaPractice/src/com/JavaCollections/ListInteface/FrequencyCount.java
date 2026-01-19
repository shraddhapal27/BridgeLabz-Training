package com.JavaCollections.ListInteface;

import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> freqMap = new HashMap<>();

        for (String item : list) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }

        System.out.println(freqMap);
    }
}
