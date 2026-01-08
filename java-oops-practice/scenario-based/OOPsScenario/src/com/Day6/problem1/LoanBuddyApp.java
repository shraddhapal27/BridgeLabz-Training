package com.Day6.problem1;

import java.util.Scanner;

public class LoanBuddyApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input from user
     System.out.print("Enter name: ");
     String name = sc.nextLine();

     System.out.print("Enter credit score: ");
     int creditScore = sc.nextInt();

     System.out.print("Enter monthly income: ");
     double income = sc.nextDouble();

     System.out.print("Enter loan amount: ");
     double loanAmount = sc.nextDouble();

     System.out.print("Enter loan term (months): ");
     int term = sc.nextInt();

     System.out.print("Enter loan type (1-Home, 2-Auto): ");
     int choice = sc.nextInt();

     // Create applicant object
     Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

     LoanApplication loan;

     // Polymorphism
     if (choice == 1) {
         loan = new HomeLoan(applicant, term);
     } else {
         loan = new AutoLoan(applicant, term);
     }
     

     // Loan approval
     loan.approveLoan();

     // Result
     if (loan.isApproved()) {
         System.out.println("Loan Approved");
         System.out.println("Monthly EMI: " + loan.calculateEMI());
     } else {
         System.out.println("Loan Rejected");
     }
     sc.close();
 }
}