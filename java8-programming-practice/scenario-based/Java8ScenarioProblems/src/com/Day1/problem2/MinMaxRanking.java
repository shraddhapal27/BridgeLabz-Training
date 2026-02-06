package com.Day1.problem2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxRanking {
   public static void main(String[] args) {
	   List<Student> list = StudentData.getStudent();
	   
	   // 1.Find the student with the best (lowest) rank.
	 Optional<Student> rank =  list.stream().min(Comparator.comparing(Student::getRank));
	 rank.ifPresent(System.out::println);
	 
	 // 2.Find the student with the worst (highest) rank.
      Optional<Student> worstRank = list.stream().max(Comparator.comparing(Student::getRank));
      worstRank.ifPresent(System.out::println);
      
      //  3.Find the second best rank holder.
     Optional<Student> secondBestRank =  list.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(1).findFirst();
     secondBestRank.ifPresent(System.out::println);
     
     // 4. Find the third best rank holder
     Optional<Student> thirdBestRank = list.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(2).findFirst();
     thirdBestRank.ifPresent(System.out::println);
     
     // 5. Find the youngest student
     Optional<Student> youngestStudent = list.stream().min(Comparator.comparingInt(Student::getAge));
     youngestStudent.ifPresent(System.out::println);
     
     // 6. Find the oldest student
     Optional<Student> oldestStudent =
    	        list.stream()
    	            .max(Comparator.comparingInt(Student::getAge));

    	oldestStudent.ifPresent(System.out::println);
   }
}
