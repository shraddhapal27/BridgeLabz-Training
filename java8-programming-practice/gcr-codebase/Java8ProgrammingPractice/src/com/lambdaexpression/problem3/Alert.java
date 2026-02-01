package com.lambdaexpression.problem3;

public class Alert {
     String message;
     String type;
     
     Alert(String message, String type){
    	this.message = message;
    	this.type = type;
     }
     
     @Override
     public String toString() {
    	 return  "[" + type + " ] :  " + message;
     }
}
