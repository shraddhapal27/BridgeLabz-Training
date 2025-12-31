/*
Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/


import java.util.Scanner;
public class DigitalWatchSimulator{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		for(int hour = 0; hour <= 23; hour++){
			if(hour == 13){
				break;
			}
		    for(int minutes = 1; minutes < 60; minutes++){
                if(hour < 10){
				  System.out.print("0" + hour + " : ");
				  if(minutes < 10){
					  System.out.print("0" + minutes);
				  }else{
					  System.out.print(minutes);
				  }
				  
			    }
			    else{
				  System.out.print(hour + " : "  );
				  if(minutes < 10){
					  System.out.print("0" + minutes);
				  }else{
					  System.out.print(minutes);
				  }
				  
			    }
			  System.out.println();
			}
		}
		    
	}
}