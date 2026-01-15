package com.Day9.problem3;

class User {

    private String username;
    private Game[] ownedGames;
    private int count = 0;

    public User(String username, int capacity) {
        this.username = username;
        ownedGames = new Game[capacity];
    }

    public void buyGame(Game game) {
        ownedGames[count++] = game;
        System.out.println(game.title + " added to " + username + "'s library");
    }

    public void showLibrary() {
        System.out.println("\nOwned Games:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + ownedGames[i].title);
        }
    }
}
