import java.util.Scanner;

public class FitnessChallengeTracker{
    public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);
	
	    int total = 0;
	    int[] pushupsCount = new int[7];
	    for(int i=0; i < pushupsCount.length; i++){
	    System.out.print("Enter the pushups for day " + (i+1) + ": ");
	    pushupsCount[i] = sc.nextInt();
	}
	for(int x : pushupsCount){
		if(x == 0){
			continue;
    	}
	    total += x;	
	}
	System.out.println();
	System.out.println("The total pushups for this week were: " + total);
	System.out.println("The average for these pushups were:" + (total / 7));
	
	}
  }
