package com.Day4.HospitalQueueSorting;

import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of patients");
		int patient = sc.nextInt();
		
		Patient[] patients = new Patient[patient];
		for(int i=0; i<patient; i++) {
			System.out.println("\nEnter details of patient " + (i+1)+"----------------");
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println("Criticality (1-10): ");
			int critics = sc.nextInt();
			
			patients[i] = new Patient(name, critics);
		}
		HospitalQueue.bubbleSort(patients);
		
		 System.out.println("\nSorted Patient List (High to Low Criticality):");
	        for (Patient p : patients) {
	            System.out.println(p.name + " - Criticality: " + p.criticality);
	        }

	        sc.close();
		
	}
}