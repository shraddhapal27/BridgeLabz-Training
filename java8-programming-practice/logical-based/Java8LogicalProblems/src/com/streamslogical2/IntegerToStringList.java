package com.streamslogical2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;


public class IntegerToStringList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);

        List<String> result =
                list.stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());

        System.out.println(result);
    }
}
