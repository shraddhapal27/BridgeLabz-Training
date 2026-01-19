package com.Day11.problem2;

import java.util.*;

class Bag {

    private int bagId;
    private String color;
    private int capacity;
    private List<Ball> balls;

    public Bag(int bagId, String color, int capacity) {
        this.bagId = bagId;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    // Add ball
    public void addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("❌ Bag " + bagId + " is full. Cannot add ball.");
            return;
        }
        balls.add(ball);
        System.out.println("✅ Ball added to Bag " + bagId);
    }

    // Remove ball by ID
    public void removeBall(int ballId) {
        Iterator<Ball> it = balls.iterator();
        while (it.hasNext()) {
            Ball b = it.next();
            if (b.getId() == ballId) {
                it.remove();
                System.out.println("🗑️ Ball removed from Bag " + bagId);
                return;
            }
        }
        System.out.println("⚠️ Ball not found in Bag " + bagId);
    }

    // Display balls
    public void displayBalls() {
        System.out.println("Bag " + bagId + " contains:");
        if (balls.isEmpty()) {
            System.out.println("  No balls");
            return;
        }
        for (Ball b : balls) {
            System.out.println("  " + b);
        }
    }

    public int getBallCount() {
        return balls.size();
    }

    public int getBagId() {
        return bagId;
    }
}
