import java.util.Scanner;
public class PercentageCalculation{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  
  // get input value for subjects
  int physics = sc.nextInt();
  int chemistry = sc.nextInt();
  int maths = sc.nextInt();
  
  // calculate percentage
  int percentage = (physics + chemistry + maths) / 3;
  
  // check the percentage
  if(percentage >= 80){
    System.out.print("Grade: A \n Remarks : Level 4, above agency-normalized standards");
  }else if(percentage >= 70 && percentage <= 79){
    System.out.print ("Grade: B \n  Remarks : Level 3, at agency-normalized standards");
  }else if(percentage >= 60 && percentage <= 69){
    System.out.print("Grade: C \n  Remarks : Level 2, below , but approaching agency-normalized standards");
  }else if(percentage >= 50 && percentage <= 59){
    System.out.print("Grade: D \n Remarks : Level 1- well below agency normalized standards");
  }else if(percentage >= 40 && percentage <= 49){
    System.out.print("Grade: E \n Remarks : Level 1-, too below agency-normalized standards");
  }else{
    System.out.print("Grade R  \n Reedial standards");
  }
 }
}