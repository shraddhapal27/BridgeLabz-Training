package day03.Hackerrank.LinkedList;

public class Reverse {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = head;
        SinglyLinkedListNode next = null;

        while (curr != null) {

            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        return prev;
    }
}
