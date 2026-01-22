package com.javagenerics.smartwarehousesystem;

public class Groceries extends WarehouseItem {

    Groceries(String name) {
        super(name);
    }

    @Override
    void displayInfo() {
        System.out.println("Grocery: " + name);
    }
}
