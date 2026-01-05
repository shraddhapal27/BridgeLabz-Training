package com.linkedlist.doublelinkedlist.problem3;

class TextNode {
    String text;
    TextNode prev;
    TextNode next;

    TextNode(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}