package com.functionalinterface.problem13;

import java.io.Serializable;

public class CustomerData implements Serializable {
    private String name;
    private int age;

    public CustomerData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
