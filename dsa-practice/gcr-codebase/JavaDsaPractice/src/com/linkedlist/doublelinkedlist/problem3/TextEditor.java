package com.linkedlist.doublelinkedlist.problem3;

class TextEditor {
    private TextNode head = null;
    private TextNode tail = null;
    private TextNode current = null;
    private int size = 0;
    private final int MAX = 10;

    // Add new state
    void addState(String newText) {
        TextNode newNode = new TextNode(newText);

        // Clear redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = newNode;
            size++;
        }

        // Maintain max size
        if (size > MAX) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo successful.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo operation
    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo successful.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Display current state
    void displayCurrent() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("Editor is empty.");
        }
    }
}