package com.encapsulation.problem6;

class NonVegItem extends FoodItem {

    private static final double NON_VEG_CHARGE = 50;

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = (getPrice() * getQuantity()) + NON_VEG_CHARGE;
        return basePrice - discountAmount;
    }
}
