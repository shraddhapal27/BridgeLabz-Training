/* 
Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;
public class OnlineQuizApplication{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("- - - - - - - - - - - - - - - - - -  ");
		System.out.println("Welcome to the Online Quiz Application");
		System.out.println("- - - - - - - - - - - - - - - - - -  ");
		System.out.println();
		
		String questions[] = {"1. Which planet is known for its beautiful rings? \nA. Jupiter \nB. Mars \nC. Saturn \nD. Uranus",
			               "2. Which revolution is known for the phrase “Liberty, Equality, Fraternity  \nA.The Russian Revolution \nB. The American Revolution \nC. The French Revolution \nD. The Industrial Revolution ",
						   "3. Which is the tallest peak in India? \nA. K2 \nB. Nanda Devi \nC. Kanchenjunga \nD. Anamudi",
						   "4. Which ancient civilization is known for its pyramids? \nA. The Romans \nB. The Greeks \nC. The Egyptians \nD. The Mayans",
						   "5. Which language is used by the computer to process data? \nA. English \nB. Binary language \nC. Hindi \nD. French"};
		
		String[] answers = {"C","C","C","C","B"};
		int rightAnswer = 0;
		int wrongAnswer = 0;
		
		for(int i=0; i < questions.length; i++){
			
			System.out.println(questions[i]);
			
			String answer = sc.next().toUpperCase();
			switch(answer){
				case "A": 
				case "B":
				case "C":
				case "D":
				
				if(answer.equals(answers[i])){
					System.out.println("Tha answer is correct!\n");
					rightAnswer++;
				}
				else{
					System.out.println("The answer is incorrect!\n");
					wrongAnswer++;
				}
				break;
				default: {
					System.out.println("Invalid option..");
					wrongAnswer++;
				}
			}
			
		}
		
		System.out.println("Result: ");
		System.out.println("Your score is: " + rightAnswer + " / 5");
		System.out.println("Correct answer: " + rightAnswer);
		System.out.println("Incorrect answer: " + wrongAnswer);
		System.out.println();
		System.out.println("Thank you for playing the online quiz game");\
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
	}
}