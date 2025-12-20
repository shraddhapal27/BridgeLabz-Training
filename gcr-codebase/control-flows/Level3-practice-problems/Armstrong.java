import java.util.Scanner;
public class Armstrong{
  public static void main(String args[]){
    
	Scanner sc = new Scanner(System.in);
	
	int number = sc.nextInt();
	int sumVariable = 0;
	int originalNumber = number; // 153
	
    while(number != 0){
		int digit = number % 10;
		sumVariable += (digit * digit * digit);
		number /= 10;
	}
	if(sumVariable == originalNumber){
		System.out.print(originalNumber + " is an Armstrong number");
	}else{
		System.out.print(originalNumber + " is not a Armstrong number");
	}
	
	sc.close();
  }
}	