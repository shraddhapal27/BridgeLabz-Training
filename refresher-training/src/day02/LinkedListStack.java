package day02;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stackk {
    Node top;
    Stackk(){
        top = null;
    }

    void push(int val){
        Node newNode = new Node(10);
        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        int popvalue = top.data;
        top = top.next;
        return popvalue;
    }

    int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedListStack {
    public static void main(String[] args) {
Stack s = new Stack(5);
s.push(10);
s.push(30);
s.push(50);
s.push(70);
s.pop();
s.peek();
s.display();
    }
}
