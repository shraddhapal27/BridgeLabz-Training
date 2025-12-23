import java.util.Scanner;
public class Palindrome{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter the string: ");
   String str = sc.next();
   
     // 
   
	 char[] ch =  str.toCharArray();
	 String reversedString = "";
	 for(int i= ch.length-1; i>=0; i--){
	   reversedString += ch[i]; 
	 }
	 
	 if(reversedString.equals(str)){
	  System.out.print("The given string is  Pallindrome");
	 }else{
	  System.out.print("The given string is not Pallindrome");
	 }
   
 }
}