package day02;
class Queue{
    int[] arr;
    int front;
    int rear;
    int capacity;

    Queue(int size){
        capacity = size;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void enqueue(int value){
        if(rear == capacity-1){
            System.out.println("Queue full");
            return;
        }
     if(front == -1){
         front = 0;
     }
        rear++;
        arr[rear] = value;
    }

    public int dequeue(){
        if(front == -1 || front > rear){
         System.out.println("Queue empty");
         return -1;
        }
        int removed = arr[front];
        front++;
        if(front > rear){
            front = -1;
            rear = -1;
        }
        return removed;
    }

    public int peek(){
        if(front == -1 || front > rear){
            System.out.println("Queue empty");
            return -1;
        }
        return arr[front];
    }

    public void display(){
        if(front == -1 || front > rear){
            System.out.println("Queue empty");
            return;
        }
        for(int i=front; i<rear; i++){
            System.out.println(arr[i] + " ");
        }
    }
}

public class ArrayQueue {
    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.enqueue(10);
        q.enqueue(20);;
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.dequeue();
        q.display();
    }
}
