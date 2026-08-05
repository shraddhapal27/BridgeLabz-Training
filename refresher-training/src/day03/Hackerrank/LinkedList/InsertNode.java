package day03.Hackerrank.LinkedList;
class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}


public class InsertNode {

    public static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        newNode.next = head;

        head = newNode;

        return head;
    }

}
