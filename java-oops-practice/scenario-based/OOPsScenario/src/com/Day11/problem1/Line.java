package com.Day11.problem1;

public class Line {
    double x1;
    double x2;
    double y1;
    double y2;
    
    Line(double x1, double x2, double x3, double x4){
    	this.x1 = x1;
    	this.x2 = x2;
    	this.y1 = y1;
    	this.y2 = y2;
    }
    
    public double calculateLength() {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );
    }
 }
