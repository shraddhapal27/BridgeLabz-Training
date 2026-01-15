package com.Day5.SmartCheckout;

import java.util.Map;

public class Customer {
    String name;
    Map<String, Integer> cart;

    Customer(String name, Map<String, Integer> cart) {
        this.name = name;
        this.cart = cart;
    }
}
