import java.util.*;
class OddAndEvenNos{
public static void main(String args[]){
  
  // Create a Scanner object
  Scanner sc = new Scanner(System.in);
  
  // Take the input from the user
   int number = sc.nextInt();
   
  // Check for a natural number
   if(number > 0){
    for(int i=1; i<=number; i++){
	  if(i % 2 ==0){
	  System.out.println(i + " is an even number");
	  }
	  else{
	  System.out.println(i + " is an odd number");
	  }
	}
   }
   else{
    System.out.print("Not a natural number");
   }
}
}