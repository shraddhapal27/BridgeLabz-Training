package com.Day11.problem2;

import java.util.*;

public class BagBallOrganiser {

    public static void main(String[] args) {

        Bag bag1 = new Bag(1, "Red", 2);
        Bag bag2 = new Bag(2, "Blue", 3);

        Ball b1 = new Ball(101, "Green", "Small");
        Ball b2 = new Ball(102, "Yellow", "Medium");
        Ball b3 = new Ball(103, "Blue", "Large");

        // Add balls
        bag1.addBall(b1);
        bag1.addBall(b2);
        bag1.addBall(b3); // ❌ capacity exceeded

        bag2.addBall(b3);

        // Display balls
        bag1.displayBalls();
        bag2.displayBalls();

        // Remove ball
        bag1.removeBall(101);
        bag1.displayBalls();

        // Display all bags & ball count
        List<Bag> bags = List.of(bag1, bag2);
        System.out.println("\nAll Bags Summary:");
        for (Bag b : bags) {
            System.out.println("Bag " + b.getBagId() +
                    " has " + b.getBallCount() + " balls");
        }
    }
}

