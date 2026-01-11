package com.Day8.problem1;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licensingTerms, boolean hasPreview) {
        super(title, artist, price, licensingTerms, hasPreview);
    }

    @Override
    public void license() {
        System.out.println("Print License Applied: " + licensingTerms);
        System.out.println("Usage: Physical prints only");
    }
}
