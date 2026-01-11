package com.Day8.problem1;

public abstract class Artwork implements IPurchasable {

    private String title;
    private String artist;
    protected String licensingTerms;   // encapsulated (protected)
    protected double price;
    private boolean hasPreview;

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licensingTerms) {
        this(title, artist, price, licensingTerms, false);
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price, String licensingTerms, boolean hasPreview) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licensingTerms = licensingTerms;
        this.hasPreview = hasPreview;
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.deductBalance(price);
            System.out.println(user.getName() + " purchased " + title);
            license();  // polymorphic call
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

