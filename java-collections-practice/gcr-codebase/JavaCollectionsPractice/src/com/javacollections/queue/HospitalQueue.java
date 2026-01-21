package com.javacollections.queue;
//Question:
//Simulate a hospital triage system where patients with

import java.util.PriorityQueue;
import java.util.Scanner;

public class HospitalQueue {

 // Patient class
 static class Patient {
     String name;
     int severity;

     Patient(String name, int severity) {
         this.name = name;
         this.severity = severity;
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // PriorityQueue based on severity (higher first)
     PriorityQueue<Patient> pq =
         new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

     System.out.print("Enter number of patients: ");
     int n = sc.nextInt();

     // Input patients
     for (int i = 0; i < n; i++) {
         System.out.print("Enter name: ");
         String name = sc.next();
         System.out.print("Enter severity: ");
         int severity = sc.nextInt();

         pq.add(new Patient(name, severity));
     }

     // Treatment order
     System.out.println("Treatment Order:");
     while (!pq.isEmpty()) {
         Patient p = pq.remove();
         System.out.println(p.name);
     }

     sc.close();
 }
}

