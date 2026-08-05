package day03.LinkedList;

class Nodee{
    int data;
    Nodee next;
    Nodee prev;

    Nodee(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLL {
    Nodee head;
    Nodee temp = head;
    public void insertAtBegin(int data){
        Nodee newNode = new Nodee(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Nodee newNode = new Nodee(data);
        if(head == null){
            head = newNode;
            return;
        }
        while(temp != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void deleteFromEnd(){
        while(temp.next.next!=null){
            temp=temp.next;
        }
    }

    void deleteAtPos(int val){
        for(int i=0; i<val-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {

    }
}
