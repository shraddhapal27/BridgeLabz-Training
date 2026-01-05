package com.linkedlist.circularLL.problem3;

public class StudentManagement {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Aman", 20, 'A');
        list.addAtEnd(2, "Riya", 21, 'B');
        list.addAtEnd(3, "Rahul", 22, 'C');

        list.display();

        list.addAtPosition(2, 4, "Neha", 19, 'A');
        System.out.println("\nAfter inserting at position 2:");
        list.display();

        list.searchByRoll(3);

        list.updateGrade(2, 'A');

        list.deleteByRoll(1);

        System.out.println("\nFinal List:");
        list.display();
    }
}
