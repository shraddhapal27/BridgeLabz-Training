package com.linkedlist.doublelinkedlist.problem3;

import java.util.*;
public class UndoRedoEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        while (true) {
            System.out.println("\n1.Type Text  2.Undo  3.Redo  4.Display  5.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter text: ");
                editor.addState(sc.nextLine());
            }

            else if (choice == 2) {
                editor.undo();
            }

            else if (choice == 3) {
                editor.redo();
            }

            else if (choice == 4) {
                editor.displayCurrent();
            }

            else if (choice == 5) {
                break;
            }
        }
        sc.close();
    }
}