package com.linkedlist.circularLL.problem2;

import java.util.*;
public class RoundRobinCPU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time Quantum: ");
        int tq = sc.nextInt();

        RoundRobinScheduler scheduler = new RoundRobinScheduler(tq);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Process ID: ");
            int pid = sc.nextInt();
            System.out.print("Burst Time: ");
            int bt = sc.nextInt();
            System.out.print("Priority: ");
            int pr = sc.nextInt();

            scheduler.addProcess(pid, bt, pr);
        }

        scheduler.execute();
        sc.close();
    }
}