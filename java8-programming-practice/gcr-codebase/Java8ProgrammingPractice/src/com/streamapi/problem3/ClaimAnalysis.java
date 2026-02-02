package com.streamapi.problem3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class ClaimAnalysis {
    public static void main(String[] args) {
    	
    	List<ClaimAmount> claims = List.of(
                new ClaimAmount("Health", 50000),
                new ClaimAmount("Car", 10000),
                new ClaimAmount("Health", 20000),
                new ClaimAmount("Car",5000)
    			);
    	
    	Map<String,Double> avgByType = claims.stream()
    			.collect(Collectors.groupingBy(c -> c.type,
    					Collectors.averagingDouble(a -> a.amount)
    					));
    	avgByType.forEach((type,avg) -> 
    	   System.out.println(type + " Average claim : " + avg)
    			);
    }
}
