package com.student;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingAndAggregation {

    public static void main(String[] args) {

        List<Student> list = StudentData.getStudent();

        // 1. Count the number of students in each department
        Map<String, Long> countByDept =
                list.stream()
                    .collect(Collectors.groupingBy(
                            Student::getDepartment,
                            Collectors.counting()
                    ));

        System.out.println("Students count by department: " + countByDept);

        // 2. Count the number of students in each city
        Map<String, Long> countByCity =
                list.stream()
                    .collect(Collectors.groupingBy(
                            Student::getCity,
                            Collectors.counting()
                    ));

        System.out.println("Students count by city: " + countByCity);

        // 3. Average age of students in each department
        Map<String, Double> avgAgeByDept =
                list.stream()
                    .collect(Collectors.groupingBy(
                            Student::getDepartment,
                            Collectors.averagingInt(Student::getAge)
                    ));

        System.out.println("Average age by department: " + avgAgeByDept);

        // 4. Average rank of students by gender
        Map<String, Double> avgRankByGender =
                list.stream()
                    .collect(Collectors.groupingBy(
                            Student::getGender,
                            Collectors.averagingInt(Student::getRank)
                    ));

        System.out.println("Average rank by gender: " + avgRankByGender);

        // 5. Total number of students
        long totalStudents = list.stream().count();
        System.out.println("Total students: " + totalStudents);

        // 6. Department with highest average rank
        Optional<Map.Entry<String, Double>> highestAvgRankDept =
                list.stream()
                    .collect(Collectors.groupingBy(
                            Student::getDepartment,
                            Collectors.averagingInt(Student::getRank)
                    ))
                    .entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue());

        highestAvgRankDept.ifPresent(entry ->
                System.out.println("Department with highest average rank: "
                        + entry.getKey() + " = " + entry.getValue())
        );
    }
}
