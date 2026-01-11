package com.Day8.problem1;

public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price, String licensingTerms) {
        super(title, artist, price, licensingTerms);
    }

    @Override
    public void license() {
        System.out.println("Digital License Applied: " + licensingTerms);
        System.out.println("Usage: Online & Commercial");
    }
}
