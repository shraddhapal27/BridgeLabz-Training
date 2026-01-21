package com.javacollections.bankingsystem;

//Manages bank operations using Map and Queue

import java.util.HashMap;
import java.util.LinkedList;

import java.util.Queue;
import java.util.TreeMap;

public class BankManager {

 // AccountNumber -> Balance
 HashMap<Integer, Integer> accountMap = new HashMap<>();

 // Queue for withdrawal requests
 Queue<Integer> withdrawalQueue = new LinkedList<>();

 // Add account
 void addAccount(int accNo, int balance) {
     accountMap.put(accNo, balance);
 }

 // Display all accounts
 void showAccounts() {
     System.out.println("\nAll Accounts:");
     for (int acc : accountMap.keySet()) {
         System.out.println("Account: " + acc + " Balance: " + accountMap.get(acc));
     }
 }

 // Sort customers by balance
 void showSortedByBalance() {

     // Balance -> AccountNumber
     TreeMap<Integer, Integer> sortedMap = new TreeMap<>();

     for (int acc : accountMap.keySet()) {
         sortedMap.put(accountMap.get(acc), acc);
     }

     System.out.println("\nAccounts Sorted by Balance:");
     for (int bal : sortedMap.keySet()) {
         System.out.println("Account: " + sortedMap.get(bal) + " Balance: " + bal);
     }
 }

 // Add withdrawal request
 void requestWithdrawal(int accNo) {
     withdrawalQueue.add(accNo);
 }

 // Process withdrawals
 void processWithdrawals(int amount) {

     System.out.println("\nProcessing Withdrawals:");

     while (!withdrawalQueue.isEmpty()) {

         int accNo = withdrawalQueue.remove();

         if (accountMap.containsKey(accNo)) {
             int bal = accountMap.get(accNo);

             if (bal >= amount) {
                 accountMap.put(accNo, bal - amount);
                 System.out.println("Withdrawal successful for Account " + accNo);
             } else {
                 System.out.println("Insufficient balance for Account " + accNo);
             }
         } else {
             System.out.println("Account not found: " + accNo);
         }
     }
 }
}
