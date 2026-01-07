package com.searching.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	System.out.println("Enter the string : ");
        String input = sc.next();

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }

        String result = sb.toString();
        System.out.println("String without duplicates: " + result);
    }
}
