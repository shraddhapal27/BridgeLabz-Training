package com.CSV.question7;

import java.io.*;
import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class SortBySalary {
    public static void main(String[] args) throws Exception {

        List<Employee> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\\\Java Workspace\\\\java-iostreams-practice\\\\gcr-codebase\\\\JavaIOstreamPractice\\\\src\\\\main\\\\java\\\\com\\\\CSV\\\\question2\\\\employees.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            list.add(new Employee(d[1], Double.parseDouble(d[3])));
        }

        list.sort((a, b) -> Double.compare(b.salary, a.salary));

        for (int i = 0; i < 5 && i < list.size(); i++) {
            System.out.println(list.get(i).name + " : " + list.get(i).salary);
        }
    }
}
