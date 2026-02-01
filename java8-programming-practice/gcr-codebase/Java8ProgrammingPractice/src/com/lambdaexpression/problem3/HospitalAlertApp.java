package com.lambdaexpression.problem3;

import java.util.function.Predicate;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class HospitalAlertApp {
    public static void main(String[] args) {
    	 List<Alert> alerts = new ArrayList<>();
    	 alerts.add(new Alert("Heart condition critical", "EMERGENCY"));
    	 alerts.add(new Alert("Take blood pressure medicine", "MEDICINE"));
    	 alerts.add(new Alert("Doctor appointment at 5pm", "APPOINTMENT"));
    	 alerts.add(new Alert("Hospital closed on Sunday", "GENERAL"));
    	 
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("Enter the user preference:");
    	 System.out.println("medicine / emergency appointment / all");
    	 
    	 String choice = sc.nextLine().toLowerCase();
    	 
    	 Predicate<Alert>  filterCondition;
    	 
    	 switch(choice) {
    	 case "emergency":
    	 filterCondition = alert -> alert.type.equals("EMERGENCY");
    	 break;
    	 
    	 case "medicine":
    	 filterCondition = alert -> alert.type.equals("MEDICINE");
    	 break;
    	 
    	 case "appointment":
         filterCondition = alert -> alert.type.equals("APPOINTMENT");
         break;
         
    	 case "all":
    		 filterCondition = alert -> true;
    		 break;
    		 
    	 default:
    		 System.out.println("Invalid choice, showing all alerts");
    		 filterCondition = alert -> true;
    		 
    	 }
    	 
    	 System.out.println("Filtered alerts");
    	 alerts.stream().filter(filterCondition).forEach(System.out::println);
    }
} 

