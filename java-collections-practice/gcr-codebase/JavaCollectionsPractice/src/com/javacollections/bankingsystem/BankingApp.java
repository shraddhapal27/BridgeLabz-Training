package com.javacollections.bankingsystem;

//Main class for Banking System

import java.util.Scanner;

public class BankingApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     BankManager manager = new BankManager();

     System.out.print("Enter number of accounts: ");
     int n = sc.nextInt();

     // Add accounts
     for (int i = 0; i < n; i++) {
         System.out.print("Enter account number: ");
         int acc = sc.nextInt();
         System.out.print("Enter balance: ");
         int bal = sc.nextInt();

         manager.addAccount(acc, bal);
     }

     manager.showAccounts();
     manager.showSortedByBalance();

     System.out.print("\nEnter number of withdrawal requests: ");
     int w = sc.nextInt();

     for (int i = 0; i < w; i++) {
         System.out.print("Enter account number for withdrawal: ");
         manager.requestWithdrawal(sc.nextInt());
     }

     System.out.print("Enter withdrawal amount: ");
     int amount = sc.nextInt();

     manager.processWithdrawals(amount);
     manager.showAccounts();

     sc.close();
 }
}
