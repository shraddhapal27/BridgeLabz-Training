package day02;

class Node1{
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queuee{
    Node1 front;
    Node1 rear;

    Queuee(){
        front = null;
        rear = null;
    }

    public void enqueue(int value){
        Node1 newNode = new Node1(value);
        if(front == null) {
             front = newNode;
             rear = newNode;
             return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return value;
    }

    int peek(){
        if(front == null){
            return -1;
        }
        return front.data;
    }
    public void display(){
        Node1 temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class LinkedListQueue {
    public static void main(String[] args) {
        Queuee q = new Queuee();
        q.enqueue(30);
        q.enqueue(35);
        q.enqueue(40);
        q.enqueue(45);
        q.peek();
        q.dequeue();
        q.display();
    }
}
