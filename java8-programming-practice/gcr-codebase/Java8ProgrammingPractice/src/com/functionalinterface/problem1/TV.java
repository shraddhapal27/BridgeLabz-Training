package com.functionalinterface.problem1;

public class TV implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("TV turn on");
		
	}

	@Override
	public void turnOff() {
      System.out.println("TV turn off");
		
	}

}
