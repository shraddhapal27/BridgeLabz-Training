import java.util.*;

public class NumberGuessing{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	
	int random = (int)(Math.random()*100) + 1;
	int attempts = 0;
	int maxAttempts = 5;
	int guess;
	
	System.out.println("Welcome to the  number guessing game--- ");
	System.out.print("Enter your number between 1 and 100");
	
	do{
	 System.out.println("Enter your guess : ");
	  guess = sc.nextInt();
	  attempts++;
	  
	  if(guess > random){
	  System.out.println("Too high");
	  }else if(guess < random){
	  System.out.println("Too low");
	  }else{
	  System.out.println("Hurrah ! you guessed the right answer.");
	  break;
	  }
	}
	while(maxAttempts > attempts );
	  if(guess != random){
	  System.out.println("The game is over. The correct number was : " + random);
	  }
	
  }
}