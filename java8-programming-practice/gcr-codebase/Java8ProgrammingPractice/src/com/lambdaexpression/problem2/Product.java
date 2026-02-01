package com.lambdaexpression.problem2;

public class Product {
	String name;
    double price;
    double rating;
    double discount;
    
     Product(String name,double price, double rating, double discount) {
    	this.price = price;
    	this.rating = rating;
    	this.discount = discount;
    }
     
     @Override
     public String toString() {
    	 return name + " | Price: " + price + "| rating : " + rating + " | dicount: " + discount;
     }
     
}
