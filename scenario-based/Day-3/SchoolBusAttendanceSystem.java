/*
 School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.Scanner;
public class SchoolBusAttendanceSystem{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   int absent = 0;
   int present = 0;
   String[] students = {"Aadi", "Alice", "Bob", "Sane", "Joe", "Anthony", "Juliet", "Grey", "Raymon", "Jennie"};
   System.out.println("Attention students, Mark your attendance");
   for(int i=0; i<students.length; i++){
	 System.out.println((students[i] + " :"));
	 System.out.println("Is " + students[i] + " present?  (Yes/no)");
	 String response = sc.next();
	 if(response.equals("yes")){
		 present++; 
	 }
	else if(response.equals("no")){
	 absent++;
    }else{
		System.out.print("Invalid input. Assuming absent");
	}
   }
   System.out.println("The absenties are - " + absent + " and" + " The presenties are - " + present);
  }
}