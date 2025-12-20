import java.util.Scanner;
public class FizzBuzz{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number >0){
			for(int i=1; i <= number; i++){
				if(i % 3 == 0){
					System.out.print("Fizz");
				}else if(i % 5 == 0){
					System.out.print("Buzz");
				}else if(i % 3 ==0 && i % 5 == 0){
					System.out.print("FizzBuzz");
				}else
				{
					System.out.print(i);
				}
			}
			
		}
		else{
				System.out.print("Negative number");
			}
		sc.close();
	}
}