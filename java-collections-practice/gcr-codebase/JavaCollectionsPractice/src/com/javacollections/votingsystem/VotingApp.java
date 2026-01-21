package com.javacollections.votingsystem;
//Main class for Voting System

import java.util.Scanner;

public class VotingApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     VoteManager manager = new VoteManager();

     System.out.print("Enter number of votes: ");
     int n = sc.nextInt();

     // Cast votes
     for (int i = 0; i < n; i++) {
         System.out.print("Enter candidate name: ");
         String name = sc.next();
         manager.castVote(name);
     }

     manager.showAllVotes();      // HashMap
     manager.showVoteOrder();     // LinkedHashMap
     manager.showSortedResults(); // TreeMap

     sc.close();
 }
}
