import java.util.Scanner;
public class CheckNumber{
  public static void main(String args[]){
    
	Scanner sc = new Scanner(System.in);
	
	int[] number = new int[5];
	
	// Take input from the user 
	 for(int i=0; i<number.length; i++){
          number[i] = sc.nextInt();
    }
	
	// check for a number
	
	 for(int i=0; i<number.length; i++){
          if(number[i] < 0){
           	System.out.println("Enter a positive number");
	  }
	  else{
	        // check for odd and even number
			
		  if(number[i] % 2 == 0){
	        System.out.println("Even"); 		
		}
		else{
		    System.out.println("Odd");
		}
	  } 
    }
	
	
	// check for the first and last elements of array
	if(number[0] ==  number[number.length-1]){
	  System.out.println("Equal");
	}
	else if(number[0] >  number[number.length-1]){
	  System.out.println("First element is greatest");
	}
	else{
	  System.out.println("Last element is greatest");
	}
  }
}