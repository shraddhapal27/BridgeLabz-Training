import java.util.Scanner;
public class VowelsAndConsoCount{
  public static void main(String[] args){
   
   int vowels = 0;
   int consonants = 0;
   
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter the string: ");
   String str = sc.next();
   
   
   // loop to check for vowels and consonants
   
   for(int i=0; i<str.length(); i++){
     if(str.charAt(i) == 'a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u' || str.charAt(i) == 'A' || str.charAt(i)  == 'E' || str.charAt(i) =='O' || str.charAt(i) == 'U'){
	   vowels++;
	 }else{
	   consonants++;
	 }
   }
	
	System.out.print("The vowels in a string are : " + vowels + " and consonants are : " + consonants);
	
  }
}