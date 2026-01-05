package com.linkedlist.circularLL.problem2;

class RoundRobinScheduler {
    private ProcessNode head = null;
    private ProcessNode tail = null;
    private int timeQuantum;

    RoundRobinScheduler(int tq) {
        this.timeQuantum = tq;
    }

    // Add process at end
    void addProcess(int pid, int burst, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burst, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    // Execute Round Robin Scheduling
    void execute() {
        if (head == null) {
            System.out.println("No processes available.");
            return;
        }

        int currentTime = 0;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int processCount = countProcesses();

        ProcessNode current = head;
        ProcessNode prev = tail;

        while (head != null) {
            System.out.println("\nExecuting Process P" + current.pid);

            if (current.remainingTime > timeQuantum) {
                current.remainingTime -= timeQuantum;
                currentTime += timeQuantum;
            } else {
                currentTime += current.remainingTime;
                current.remainingTime = 0;

                current.turnAroundTime = currentTime;
                current.waitingTime = current.turnAroundTime - current.burstTime;

                totalWaitingTime += current.waitingTime;
                totalTurnAroundTime += current.turnAroundTime;

                System.out.println("Process P" + current.pid + " completed.");

                // Remove completed process
                if (current == head && current == tail) {
                    head = tail = null;
                    break;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }

                current = prev.next;
                displayProcesses();
                continue;
            }

            prev = current;
            current = current.next;
            displayProcesses();
        }

        System.out.println("\nAverage Waiting Time: " +
                (double) totalWaitingTime / processCount);
        System.out.println("Average Turnaround Time: " +
                (double) totalTurnAroundTime / processCount);
    }

    // Display processes
    void displayProcesses() {
        if (head == null) {
            System.out.println("No processes remaining.");
            return;
        }

        ProcessNode temp = head;
        System.out.print("Processes: ");
        do {
            System.out.print("P" + temp.pid + "(" + temp.remainingTime + ") ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Count processes
    int countProcesses() {
        if (head == null)
            return 0;

        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}