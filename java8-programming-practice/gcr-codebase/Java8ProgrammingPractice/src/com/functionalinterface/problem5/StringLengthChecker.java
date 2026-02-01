package com.functionalinterface.problem5;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int limit = 20;

        // Function converts String to its length
        Function<String, Integer> getLength = String::length;

        String message = "Hello, Functional Interfaces!";

        int length = getLength.apply(message);
        System.out.println("Message length: " + length);

        if (length > limit) {
            System.out.println("Message exceeds the character limit!");
        } else {
            System.out.println("Message is within the limit.");
        }
    }
}
