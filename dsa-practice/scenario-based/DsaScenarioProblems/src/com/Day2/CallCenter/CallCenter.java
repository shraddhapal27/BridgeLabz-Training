package com.Day2.CallCenter;

import java.util.*;

class CallCenter {

    Queue<Customer> normalQueue = new LinkedList<>();
    PriorityQueue<Customer> vipQueue;
    HashMap<String, Integer> callCount = new HashMap<>();

    
    CallCenter() {
        vipQueue = new PriorityQueue<>(
            (c1, c2) -> c1.name.compareTo(c2.name)
        );
    }

    
    void addCall(String name, boolean isVIP) {

        Customer c = new Customer(name, isVIP);

        if (isVIP) {
            vipQueue.add(c);
        } else {
            normalQueue.add(c);
        }

        callCount.put(name, callCount.getOrDefault(name, 0) + 1);
        System.out.println("Call added for " + name);
    }

    
    void handleCall() {

        Customer c;

        if (!vipQueue.isEmpty()) {
            c = vipQueue.poll();
            System.out.println("Handling VIP customer: " + c.name);
        } 
        else if (!normalQueue.isEmpty()) {
            c = normalQueue.poll();
            System.out.println("Handling normal customer: " + c.name);
        } 
        else {
            System.out.println("No calls in queue");
        }
    }

    
    void showCallCount() {
        System.out.println("\n📞 Monthly Call Count:");
        for (String name : callCount.keySet()) {
            System.out.println(name + " → " + callCount.get(name));
        }
    }
