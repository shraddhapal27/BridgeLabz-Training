package day03.LinkedList;

class Nodeee{
    int data;
    Nodeee next;
    Nodeee(int data){
        this.data = data;
        this.next = null;
    }
}
public class CircularLL {
Nodeee head;
    Nodeee temp = head;
    public void insert(int val){
        Nodeee newNode = new Nodeee(val);
        while(temp != head){
            temp = temp.next;
        }
        temp.next = newNode;
        head = newNode;
        
    }
}
