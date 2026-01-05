package com.linkedlist.singlelinkedlist.problem1;


class StudentNode {
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    StudentNode head;

    void addAtBeginning(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
        System.out.println("Student added at beginning");
    }

    void addAtEnd(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Student added at end");
    }

    void addAtPosition(int position, int rollNo, String name, int age, char grade) {
        if (position == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Student added at position " + position);
    }

    void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted");
        }
    }

    void searchByRollNo(int rollNo) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println("Roll No: " + temp.rollNo);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    void updateGrade(int rollNo, char newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    void display() {
        if (head == null) {
            System.out.println("No student records available");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            System.out.println(
                "Roll No: " + temp.rollNo +
                ", Name: " + temp.name +
                ", Age: " + temp.age +
                ", Grade: " + temp.grade
            );
            temp = temp.next;
        }
    }
}

