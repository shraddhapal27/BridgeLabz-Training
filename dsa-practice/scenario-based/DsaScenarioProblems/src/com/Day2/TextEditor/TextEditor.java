package com.Day2.TextEditor;

import java.util.Stack;

class TextEditor {

    String content = "";
    Stack<Action> undoStack = new Stack<>();
    Stack<Action> redoStack = new Stack<>();

    
    void insert(String text) {
        content += text;
        undoStack.push(new Action("insert", text));
        redoStack.clear();
        System.out.println("Inserted: " + text);
    }

    
    void delete(int length) {

        if (length > content.length()) {
            System.out.println("Not enough text to delete");
            return;
        }

        String removed = content.substring(content.length() - length);
        content = content.substring(0, content.length() - length);

        undoStack.push(new Action("delete", removed));
        redoStack.clear();
        System.out.println("Deleted: " + removed);
    }

    
    void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("insert")) {
            content = content.substring(0, content.length() - action.text.length());
        } else {
            content += action.text;
        }

        redoStack.push(action);
        System.out.println("Undo performed");
    }

    
    void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("insert")) {
            content += action.text;
        } else {
            content = content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed");
    }

    
    void display() {
        System.out.println("Current Text: " + content);
    }
}

