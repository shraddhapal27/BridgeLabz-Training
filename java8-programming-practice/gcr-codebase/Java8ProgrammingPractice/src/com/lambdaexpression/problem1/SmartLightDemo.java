package com.lambdaexpression.problem1;

public class SmartLightDemo {
    public static void main(String[] args) {
    	LightPattern motionTrigger = () -> System.out.println("Lights on at 100 % brightness");
    	LightPattern nightTrigger = () -> System.out.println("Lights on at 30% warmness");
    	LightPattern voiceTrigger = () -> System.out.println("Lights on with Part mode colors");
    	
    	motionTrigger.activate();
    	nightTrigger.activate();
    	voiceTrigger.activate();
    	
    }
}
