package com.student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BonusChallenges {
    public static void main(String[] args) {
    	List<Student> list = StudentData.getStudent();
    	
    	// 1. Top 3 youngest students
    	list.stream().sorted(Comparator.comparing(Student::getAge)).limit(3).forEach(System.out::println);
    	
    	 // 2. Top 3 oldest students
    	list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).limit(3).forEach(System.out::println);
    	
         // 3.Partition students based on age > 25.
    	Map<Boolean, List<String>> partitionByAge = list.stream().collect(Collectors.partitioningBy(s -> s.getAge() > 25, Collectors.mapping(Student::getFirstName,Collectors.toList()) ));
    	System.out.println(partitionByAge);
    	
    	// 4. .Partition students based on rank < 100.
      Map <Boolean, List<Student>> partitionByRank =  list.stream().collect(Collectors.partitioningBy(s -> s.getRank() > 100));
      System.out.println(partitionByRank);
      
      //  5. City having maximum students
    System.out.println("\n----- City with maximum students -----");
    list.stream()
            .collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .ifPresent(System.out::println);
  // 6. Department having minimum students
  System.out.println("\n----- Department with minimum students -----");
  list.stream()
          .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))
          .entrySet()
          .stream()
          .min(Map.Entry.comparingByValue())
          .ifPresent(System.out::println);
    }
}
