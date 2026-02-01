package com.functionalinterface.problem4;

import java.util.function.Predicate;

public class TemeratureAlert {
    public static void main(String[] args) {
    	double threshold = 37.5;
    	
    	Predicate<Double> isHighTemp = temp -> temp > threshold;


    	 double[] readings = {36.7, 37.2, 38.1, 36.9};

         for (double t : readings) {
             if (isHighTemp.test(t)) {
                 System.out.println("ALERT! High temperature: " + t);
             } else {
                 System.out.println("Temperature normal: " + t);
             }
         }
    	
    }
}
