package com.student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedLevel {
	public static void main(String[] args) {
    List<Student> list = StudentData.getStudent();

//
//    // 6. Find students whose rank is odd
//    System.out.println("\n----- Students with odd rank -----");
//    students.stream()
//            .filter(s -> s.getRank() % 2 != 0)
//            .forEach(System.out::println);
    
 // 1. Convert student list into Map<Id, Name>
    Map<Integer,String> idNameMap = list.stream().collect(Collectors.toMap(Student::getId, Student::getFirstName));
    System.out.println(idNameMap);
    
 // 2. Convert student list into Map<Department, List<Student>>
    Map<String,List<Student>> deptMap = list.stream().collect(Collectors.groupingBy(Student::getDepartment));
    System.out.println(deptMap);
     
 // 3. Find students whose name starts with 'S'
    list.stream().filter(s -> s.getFirstName().startsWith("S")).forEach(System.out::println);
    
    // 4. Find students whose name length > 5
    list.stream().filter(s -> s.getFirstName().length() > 5).forEach(System.out::println);
    
 // 5. Find students whose rank is even
    list.stream().filter(s -> s.getRank() % 2 == 0).forEach(System.out::println);
    
 // 6. Find students whose rank is odd
    list.stream().filter(s -> s.getRank() % 2 != 0).forEach(System.out::println);
    
	}
}
