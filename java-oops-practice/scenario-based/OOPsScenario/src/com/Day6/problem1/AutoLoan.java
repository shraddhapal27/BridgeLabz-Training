package com.Day6.problem1;

public class AutoLoan extends LoanApplication {

	 // Constructor
	 public AutoLoan(Applicant applicant, int term) {
	     super(applicant, term, 9.5);
	 }

	 // EMI logic for auto loan
	 public double calculateEMI() {
	     double p = applicant.getLoanAmount();
	     double r = 9.5 / (12 * 100);
	     int n = term;

	     return (p * r * Math.pow(1 + r, n)) /
	            (Math.pow(1 + r, n) - 1);
	 }
	}