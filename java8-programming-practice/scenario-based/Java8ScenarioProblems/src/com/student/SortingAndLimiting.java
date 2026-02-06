package com.student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAndLimiting {
    public static void main(String[] args) {
    	List<Student> list = StudentData.getStudent();
    
    	// 1.Sort students by rank (ascending).
      list.stream().sorted(Comparator.comparing(Student::getRank)).forEach(System.out::println);
      
      // 2.Sort students by age (descending).
      list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(System.out::println);
      
      // 3.Print top 5 students based on rank.
      list.stream()
      .sorted(Comparator.comparing(Student::getRank))
      .limit(5)
      .forEach(System.out::println);
      
      // 4.Print last 3 students based on rank.
     long count = list.size();
      list.stream()
      .sorted(Comparator.comparing(Student::getRank))
      .skip(count - 3)
      .forEach(System.out::println);
    	
      // 5. Print students sorted by name and then rank
    	list.stream()
        .sorted(Comparator
                .comparing(Student::getFirstName)
                .thenComparing(Student::getRank))
        .forEach(System.out::println);
    }
}
