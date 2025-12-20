import java.util.Scanner;
public class BMI{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	  
	  // take weight in kgs 
	  double weight = sc.nextDouble();
	  
	  // take height in cm
	  double heightCm = sc.nextDouble();
	  
	  // convert height from cm into m
	  double heightM = heightCm / 100;
	  
	  //BMI formula
	  double BMI = weight / (heightM * heightM);
	  
	  System.out.println("BMI = " + BMI);
	  
	  // determine weight status 
	    if (BMI < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (BMI >= 25 && BMI < 29.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
		
		sc.close();
  }
}