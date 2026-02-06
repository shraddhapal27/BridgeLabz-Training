package com.java8workshop;

@FunctionalInterface
interface FareCalculator {
    double calculateFare(double baseFare, int passengers);
}