    package day03.Hackerrank.LinkedList;

    class SinglyLinkedList{
        int data;
        SinglyLinkedList next;

        public SinglyLinkedList(int data) {
            this.data = data;
            this.next = null;
        }

    }


    public class PrintElements{
        public static void main(String[] args) {
            SinglyLinkedList head = new SinglyLinkedList(90);
            SinglyLinkedList second = new SinglyLinkedList(100);
            SinglyLinkedList third = new SinglyLinkedList(110);

            head.next = second;
            second.next = third;

            SinglyLinkedList temp = head;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }