package com.Day6.problem1;

public class LoanApplication implements IApprovable {

	 protected Applicant applicant;
	 protected int term;                // months
	 protected double interestRate;
	 protected boolean approved;        // internal use

	 // Constructor
	 public LoanApplication(Applicant applicant, int term, double interestRate) {
	     this.applicant = applicant;
	     this.term = term;
	     this.interestRate = interestRate;
	     approved = false;
	 }

	 // Loan approval logic
	 public void approveLoan() {
	     if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 20000) {
	         approved = true;
	     }
	 }

	 // EMI calculation
	 public double calculateEMI() {
	     double p = applicant.getLoanAmount();
	     double r = interestRate / (12 * 100);
	     int n = term;

	     return (p * r * Math.pow(1 + r, n)) /
	            (Math.pow(1 + r, n) - 1);
	 }

	 public boolean isApproved() {
	     return approved;
	 }
	}