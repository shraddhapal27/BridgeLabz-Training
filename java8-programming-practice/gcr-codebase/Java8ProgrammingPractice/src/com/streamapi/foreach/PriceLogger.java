package com.streamapi.foreach;

import java.util.LinkedList;
import java.util.List;

public class PriceLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Double> prices = new LinkedList<>();
    prices.add(3.0);
    prices.add(5.5);
    prices.add(3.9);
    prices.add(3.2);
    
    prices.forEach(System.out::println);
	}

}
