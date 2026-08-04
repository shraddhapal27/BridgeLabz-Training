package day02;

class Stack{
    int[] arr;
    int top;
    int capacity;

    public Stack(int size){
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int value){
        if(top == capacity-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = value;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        int popValue = arr[top];
        top--;
        return popValue;
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public void display(){
      if(top == -1){
          System.out.println("Stack is empty");
      }
      for(int i = top; i>=0; i--){
          System.out.println(arr[i] + " ");
      }
    }
}
public class ArrayStack {
    public static void main(String[] args) {
        Stack s = new Stack(6);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        s.peek();
        s.display();
    }
}
