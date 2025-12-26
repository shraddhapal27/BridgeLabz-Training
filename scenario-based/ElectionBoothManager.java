import java.util.Scanner;

public class ElectionBoothManager{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	
	int voteA = 0, voteB = 0, voteC = 0;
	
	while(true){
	  int age = sc.nextInt();
	  
	  // Exit condition
	  if(age == -1){
	    break;
	  }
	  
	  //Eligibility check
	  if(age >= 18){
	   System.out.println("Eligible to vote");
	   System.out.println("vote for candidate : ");
	   System.out.println("1. Candidate A");
	   System.out.println("2. Candidate B");
	   System.out.println("3. Candidate C");
	   
	   int vote = sc.nextInt();
	   
	   // Record vote
	     if(vote == 1){
		   voteA++
		 }else if(vote == 2){
		   voteB++
		 }else if(vote == 3){
		   voteC++
		 }else{
		   System.out.println("Invalid vote!");
		 }
		 
	  }
	}
	// result
	    System.out.println("\n--- Voting Results ---");
        System.out.println("Candidate A Votes: " + voteA);
        System.out.println("Candidate B Votes: " + voteB);
        System.out.println("Candidate C Votes: " + voteC);
		
		sc.close()
  }
}