// create a program to check whether the given day and month is a spring season or not.

import java.util.*;
class SpringSeason{
  public static void main(String args[]){
  
  // create a scanner object
  Scanner sc = new Scanner(System.in);
  
  int month = sc.nextInt();
  int day = sc.nextInt();
  
  // condition to check the spring season
  if((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && month <= 20)){
    System.out.print("Its a Spring Season");
    }else{
	System.out.print("Not a Spring Season");
	}
  }
}