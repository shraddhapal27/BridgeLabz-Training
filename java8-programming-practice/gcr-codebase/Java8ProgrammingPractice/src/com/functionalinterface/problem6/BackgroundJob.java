package com.functionalinterface.problem6;

public class BackgroundJob {
    public static void main(String[] args) {
        // Runnable task
        Runnable task = () -> {
            System.out.println("Task started in background...");
            try {
                Thread.sleep(2000); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task completed!");
        };

        // Run in a new thread
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread continues...");
    }
}

