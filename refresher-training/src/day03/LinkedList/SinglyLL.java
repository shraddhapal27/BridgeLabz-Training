package day03.LinkedList;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SinglyLL {
    Node head;
    Node temp = head;
    public void insert(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    void delete(){

        while(temp.next.next !=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    void insertAtPos(int val, int pos){
     Node newNode = new Node(val);
     for(int i=1; i<pos-1; i++){
         temp = temp.next;
     }
     newNode.next = temp.next;
     temp.next = newNode;
    }

    void deleteAtPos(int pos){
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {

    }
}
