package com.streamapi.foreach;

import java.util.List;

public class SensorReading {
    public static void main(String[] args) {
       double threshold = 49.5;
       List<Double> readings = List.of(20.6,13.5,56.2);
       
      readings.stream().filter(x -> x > threshold).forEach(System.out::println);
    }
}
