package com.linkedlist.circularLL.problem3;

class StudentLinkedList {
    StudentNode head;
    void addAtBeginning(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }
    void addAtEnd(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void addAtPosition(int pos, int roll, String name, int age, char grade) {
        if (pos == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    void deleteByRoll(int roll) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.roll == roll) {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.roll != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted");
        }
    }
    void searchByRoll(int roll) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Student Found:");
                System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }
	void updateGrade(int roll, char newGrade) {
	    StudentNode temp = head;
	
	    while (temp != null) {
	        if (temp.roll == roll) {
	            temp.grade = newGrade;
	            System.out.println("Grade updated");
	            return;
	        }
	        temp = temp.next;
	    }
	    System.out.println("Student not found");
	}
    void display() {
        if (head == null) {
            System.out.println("No student records");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            System.out.println(
                temp.roll + " | " + temp.name + " | " + temp.age + " | " + temp.grade
            );
            temp = temp.next;
        }
    }
}

