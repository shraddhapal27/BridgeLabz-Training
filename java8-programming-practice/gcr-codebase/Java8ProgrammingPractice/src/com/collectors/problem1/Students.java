package com.collectors.problem1;

public class Students {
    String name;
    String grade;
    
    Students(String name, String grade){
    	this.name = name;
    	this.grade = grade;
    }
    
    public String toString() {
    	return name + "'s "
    }
}
