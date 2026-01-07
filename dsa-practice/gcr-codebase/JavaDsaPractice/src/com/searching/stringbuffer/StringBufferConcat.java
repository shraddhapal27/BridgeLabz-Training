package com.searching.stringbuffer;

public class StringBufferConcat {
    public static void main(String[] args) {

        String[] arr = {"Java", " ", "is", " ", "powerful"};

        // Step 1: Create StringBuffer
        StringBuffer sb = new StringBuffer();

        // Step 2 & 3: Append each string
        for (String str : arr) {
            sb.append(str);
        }

        // Step 4: Convert to String
        String result = sb.toString();

        System.out.println("Concatenated String: " + result);
    }
}
