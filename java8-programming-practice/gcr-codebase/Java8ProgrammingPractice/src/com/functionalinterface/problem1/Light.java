package com.functionalinterface.problem1;

public class Light implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Light turn on");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Light turn off");
	}

}
