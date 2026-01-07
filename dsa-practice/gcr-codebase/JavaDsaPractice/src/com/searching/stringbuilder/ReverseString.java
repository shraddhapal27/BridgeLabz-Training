package com.searching.stringbuilder;

import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the string : ");
        String input = sc.next();

        // Step 1 & 2: Create StringBuilder and append string
        StringBuilder sb = new StringBuilder(input);

        // Step 3: Reverse the string
        sb.reverse();

        // Step 4: Convert back to String
        String output = sb.toString();

        System.out.println("Reversed String: " + output);
    }
}
