package com.encapsulation.problem6;

public class OnlineFoodDelivery {

    public static void processOrder(FoodItem item) {
        System.out.println(item.getItemDetails());
        System.out.println(item.getDiscountDetails());
        System.out.println("Total Price: ₹" + item.calculateTotalPrice());
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        FoodItem item1 = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 250, 1);

        item1.applyDiscount(10);
        item2.applyDiscount(5);

        processOrder(item1);
        processOrder(item2);
    }
}
