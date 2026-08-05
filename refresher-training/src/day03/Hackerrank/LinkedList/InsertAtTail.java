package day03.Hackerrank.LinkedList;

class SinglyLinkedListNodee {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNodee(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtTail {
    public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        // If list is empty
        if (head == null) {
            return newNode;
        }

        SinglyLinkedListNode temp = head;

        // Traverse till last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Attach new node
        temp.next = newNode;

        return head;
    }
}
