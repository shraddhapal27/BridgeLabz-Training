import java.util.Scanner;
class SalaryBonus{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   
   double salary = sc.nextDouble();
   int year = sc.nextInt();
   double bonus;
   if(year > 5){
     bonus = salary*0.05;
	 System.out.print("Bonus Amount: " + bonus);
   }else{
     System.out.print("No bonus. Service is 5 years or less");
    }
   
   sc.close();
  }
}