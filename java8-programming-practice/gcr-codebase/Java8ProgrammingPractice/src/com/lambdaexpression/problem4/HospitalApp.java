package com.lambdaexpression.problem4;

import java.util.List;
import java.util.Arrays;

public class HospitalApp {
    public static void main(String[] args) {
    	List<Integer> patientIDs = Arrays.asList(101,102,103,104,105);
    	System.out.println("List of patient id's : ");
        patientIDs.forEach(System.out::println); 	
    }
}
