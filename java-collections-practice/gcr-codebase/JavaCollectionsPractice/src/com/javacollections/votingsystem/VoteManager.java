package com.javacollections.votingsystem;

//Manages voting using different Map types

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VoteManager {

 // Stores votes (fast access)
 HashMap<String, Integer> voteMap = new HashMap<>();

 // Maintains order of voting
 LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

 // Add a vote
 void castVote(String candidate) {

     // HashMap count
     if (voteMap.containsKey(candidate)) {
         voteMap.put(candidate, voteMap.get(candidate) + 1);
     } else {
         voteMap.put(candidate, 1);
     }

     // LinkedHashMap count
     if (voteOrder.containsKey(candidate)) {
         voteOrder.put(candidate, voteOrder.get(candidate) + 1);
     } else {
         voteOrder.put(candidate, 1);
     }
 }

 // Display votes in insertion order
 void showVoteOrder() {
     System.out.println("\nVotes in Order:");
     for (String c : voteOrder.keySet()) {
         System.out.println(c + " = " + voteOrder.get(c));
     }
 }

 // Display results in sorted order
 void showSortedResults() {
     TreeMap<String, Integer> sorted =
             new TreeMap<>(voteMap);

     System.out.println("\nSorted Results:");
     for (String c : sorted.keySet()) {
         System.out.println(c + " = " + sorted.get(c));
     }
 }

 // Display raw HashMap data
 void showAllVotes() {
     System.out.println("\nAll Votes:");
     System.out.println(voteMap);
 }
}

