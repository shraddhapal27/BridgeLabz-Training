package com.searching.challenge1;

public class StringComparison {

    public static void main(String[] args) {

        int n = 1_000_000;

        StringBuilder sb = new StringBuilder();
        long startSB = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }

        long endSB = System.nanoTime();
        System.out.println("StringBuilder Time (ns): " + (endSB - startSB));

        StringBuffer buffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        System.out.println("StringBuffer Time (ns): " + (endBuffer - startBuffer));
    }
}
