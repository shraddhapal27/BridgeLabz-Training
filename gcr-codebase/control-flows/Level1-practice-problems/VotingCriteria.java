// Create a program to check whether a person can vote, depending on the voting criteria

import java.util.*;
class VotingCriteria{
 public static void main(String args[]){
 
 // create a scanner object
   Scanner sc = new Scanner(System.in);
   
   int age = sc.nextInt();
   
   // condition to check the voting criteria
   if(age >= 18){
    System.out.print("The person's age is " + age + " and can vote");
   }
   else{
    System.out.print("The person's age is " + age + " and cannot vote");
   }
   
   sc.close();
 }
}