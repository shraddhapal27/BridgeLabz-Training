package com.javagenerics.smartwarehousesystem;

public class Furniture extends WarehouseItem {

    Furniture(String name) {
        super(name);
    }

    @Override
    void displayInfo() {
        System.out.println("Furniture: " + name);
    }
}
