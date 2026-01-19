package com.JavaCollections.queueinterface;

class CircularQueue {
    int[] arr;
    int front = 0, size = 0;
    int capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    void enqueue(int x) {
        arr[(front + size) % capacity] = x;
        if (size < capacity) {
            size++;
        } else {
            front = (front + 1) % capacity;
        }
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.display();
    }
}
