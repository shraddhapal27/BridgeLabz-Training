import java.util.Scanner;
public class PrintOddEven{
  public static void main(String args[]){
    
	Scanner sc = new Scanner(System.in);
	
	// check for a natural number
	int number = sc.nextInt();
	if(number <= 0){
	  System.out.print("Error : Enter a natural number");	
	}
	int[] even = new int[number / 2 + 1];
	int[] odd = new int[number / 2 + 1]; 
	
	int evenIndex = 0;
	int oddIndex = 0;
	
	
	// check for even and odd numbers
	 for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }
   
    // displaying the results
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
	 }
	}
  }
}