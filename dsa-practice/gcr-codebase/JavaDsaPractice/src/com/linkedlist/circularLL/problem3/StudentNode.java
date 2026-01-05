package com.linkedlist.circularLL.problem3;
class StudentNode {
    int roll;
    String name;
    int age;
    char grade;
    StudentNode next;

    // Constructor
    StudentNode(int roll, String name, int age, char grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}