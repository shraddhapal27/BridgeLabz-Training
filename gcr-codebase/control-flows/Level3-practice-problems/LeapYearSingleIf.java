import java.util.Scanner;
public class LeapYearSingleIf{
 public static void main(String args[]){
  
   Scanner sc = new Scanner(System.in);

	int year = sc.nextInt();
	
	 if (year >= 1582 &&
           ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {

            System.out.println("Year is a Leap Year");
        } 
        else if (year >= 1582) {
            System.out.println("Year is not a Leap Year");
        } 
        else {
            System.out.println("Leap Year calculation is valid only for year >= 1582");
        }

        sc.close();
  }
}