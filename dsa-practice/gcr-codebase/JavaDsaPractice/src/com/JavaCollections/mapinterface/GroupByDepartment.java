package com.JavaCollections.mapinterface;

import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : employees) {
            map
                .computeIfAbsent(e.department, k -> new ArrayList<>())
                .add(e);
        }

        map.forEach((k, v) ->
            System.out.println(k + ": " + v)
        );
    }
}

