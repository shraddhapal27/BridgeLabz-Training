package com.inheritance.hierarchialinheritance.problem1;

//Superclass
class BankAccount {
 String accountNumber;
 double balance;

 // Constructor
 BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 void displayDetails() {
     System.out.println("Account Number : " + accountNumber);
     System.out.println("Balance        : ₹" + balance);
 }

 // Method to be overridden
 void displayAccountType() {
     System.out.println("Account Type   : Bank Account");
 }
}

