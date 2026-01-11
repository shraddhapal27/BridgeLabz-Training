package com.Day8.problem1;

import java.util.Scanner;

public class ArtifyApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User details
        System.out.print("Enter buyer name: ");
        String name = sc.nextLine();

        System.out.print("Enter wallet balance: ");
        double balance = sc.nextDouble();
        sc.nextLine(); // consume newline

        User buyer = new User(name, balance);

        // Artwork 1 - Digital Art
        System.out.println("\n--- Enter Digital Art Details ---");
        System.out.print("Title: ");
        String dTitle = sc.nextLine();

        System.out.print("Artist: ");
        String dArtist = sc.nextLine();

        System.out.print("Price: ");
        double dPrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("License Type: ");
        String dLicense = sc.nextLine();

        Artwork art1 = new DigitalArt(dTitle, dArtist, dPrice, dLicense);

        // Artwork 2 - Print Art
        System.out.println("\n--- Enter Print Art Details ---");
        System.out.print("Title: ");
        String pTitle = sc.nextLine();

        System.out.print("Artist: ");
        String pArtist = sc.nextLine();

        System.out.print("Price: ");
        double pPrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("License Type: ");
        String pLicense = sc.nextLine();

        System.out.print("Has Preview (true/false): ");
        boolean hasPreview = sc.nextBoolean();

        Artwork art2 = new PrintArt(pTitle, pArtist, pPrice, pLicense, hasPreview);

        // Purchase
        System.out.println("\n--- Purchasing Artworks ---");
        art1.purchase(buyer);
        art2.purchase(buyer);

        // Final Balance
        System.out.println("\nRemaining Balance: " + buyer.getWalletBalance());

        sc.close();
    }
}
