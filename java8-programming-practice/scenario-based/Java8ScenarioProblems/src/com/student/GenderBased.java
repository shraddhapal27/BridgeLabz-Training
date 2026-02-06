package com.student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GenderBased {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Student> list = StudentData.getStudent();
    Map<String, Long> genderCount =    list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
    System.out.println(genderCount);
    
    //Find the average age of male students
    double avgMaleAge =  list.stream().filter(s -> s.getGender().equalsIgnoreCase("Male")).collect(Collectors.averagingInt(Student::getAge));
    System.out.println(avgMaleAge);
    
    //3. Find the average age of female students
    double avgFemaleAge =
            list.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.averagingInt(Student::getAge));

    System.out.println("Average age of female students: " + avgFemaleAge);

    // 4. Find the highest ranked male student
    Optional<Student> bestMaleStudent =
            list.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                .min(Comparator.comparingInt(Student::getRank));

    bestMaleStudent.ifPresent(System.out::println);
    
    // 5. Find the highest ranked female student
    Optional<Student> bestFemaleStudent =
            list.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Female"))
                .min(Comparator.comparingInt(Student::getRank));

    bestFemaleStudent.ifPresent(System.out::println);

	}

}
