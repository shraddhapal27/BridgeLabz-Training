package com.Day6.problem1;

public class HomeLoan extends LoanApplication {

	 // Constructor
	 public HomeLoan(Applicant applicant, int term) {
	     super(applicant, term, 8.5);
	 }

	 // EMI logic for home loan
	 public double calculateEMI() {
	     double p = applicant.getLoanAmount();
	     double r = 8.5 / (12 * 100);
	     int n = term;

	     return (p * r * Math.pow(1 + r, n)) /
	            (Math.pow(1 + r, n) - 1);
	 }
	}
