package com.Day5.problem1;

public class Quiz {
   
   private String[] questions;
   private final String[] answers;
   private  int score;
   
   Quiz(String difficulty){
	   if(difficulty.equalsIgnoreCase("Easy")) {
		   questions = new String[] {"Q1", "Q2", "Q3"};
		   answers = new String[] {"A", "B", "C"};   
	   } else if (difficulty.equalsIgnoreCase("Medium")) {
           questions = new String[]{"Q1", "Q2", "Q3", "Q4", "Q5"};
           answers = new String[]{"A", "B", "C", "D", "A"};
       } 
       else {
           questions = new String[]{"Q1","Q2","Q3","Q4","Q5","Q6"};
           answers = new String[]{"A","B","C","D","A","B"};
       }
   }
   
   void calculateSCore(String[] userAnswers) {
	   for (int i = 0; i < answers.length; i++) {
           if (userAnswers[i].equals(answers[i])) {
               score += 1;  
           }
       }
   }
   

   double getPercentage() {
       return (score * 100.0) / answers.length;
   }
}
   
}
