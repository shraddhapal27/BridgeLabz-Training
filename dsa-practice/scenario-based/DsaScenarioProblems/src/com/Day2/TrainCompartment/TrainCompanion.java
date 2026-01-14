package com.Day2.TrainCompartment;

public class TrainCompanion {
    Compartment head;
    Compartment tail;

    
    void traverseForward() {
        Compartment temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.name + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
 
    
    void traverseBackward() {
        Compartment temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.name + " <-> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }

    
    void addCompartment(String name) {
        Compartment newNode = new Compartment(name);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    
    void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } 
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } 
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println(name + " compartment removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }

    
    void findCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Current: " + temp.name);
                System.out.println("Previous: " + 
                    (temp.prev != null ? temp.prev.name : "None"));
                System.out.println("Next: " + 
                    (temp.next != null ? temp.next.name : "None"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Service not found");
    }
}