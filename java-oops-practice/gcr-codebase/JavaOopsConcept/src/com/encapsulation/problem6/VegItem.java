package com.encapsulation.problem6;

class VegItem extends FoodItem {

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discountAmount;
    }
}
