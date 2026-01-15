package com.Day9.problem3;

class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Constructor for Paid Game
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Constructor for Free Game
    public Game(String title, String genre, double rating) {
        this(title, genre, 0.0, rating);
    }

    // Apply seasonal offer using operator
    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }

    @Override
    public void playDemo() {
        System.out.println("Playing demo of game...");
    }
}
