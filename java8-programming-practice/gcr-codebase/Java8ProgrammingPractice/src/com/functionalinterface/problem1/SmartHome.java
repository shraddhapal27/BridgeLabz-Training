package com.functionalinterface.problem1;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {

	public static void main(String[] args) {
		List<SmartDevice> devices = List.of(
				new Light(),
				new AirConditioner(),
				new TV()
				);
     devices.forEach(SmartDevice::turnOn);
     devices.forEach(SmartDevice::turnOff);
	}
}
