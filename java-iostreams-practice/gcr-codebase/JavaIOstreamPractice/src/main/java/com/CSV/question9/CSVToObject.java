package com.CSV.question9;

import java.io.*;
import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class CSVToObject {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Java Workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOstreamPractice\\src\\main\\java\\com\\CSV\\question1\\students.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            students.add(new Student(
                    Integer.parseInt(d[0]),
                    d[1],
                    Integer.parseInt(d[3])
            ));
        }

        students.forEach(System.out::println);
    }
}
