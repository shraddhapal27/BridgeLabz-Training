package com.Day9.problem3;

import java.util.Scanner;

public class GameBoxApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        User user = new User(username, 5);

        System.out.print("Enter game type (1-Arcade, 2-Strategy): ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter game title: ");
        String title = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter rating: ");
        double rating = sc.nextDouble();

        Game game;

        if (choice == 1) {
            game = new ArcadeGame(title, price, rating);
        } else {
            game = new StrategyGame(title, price, rating);
        }

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();
        game.applyDiscount(discount);

        game.download();
        game.playDemo();     // polymorphism

        user.buyGame(game);
        user.showLibrary();

        sc.close();
    }
}

