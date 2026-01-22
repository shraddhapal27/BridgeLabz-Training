package com.Day8.problem1;

public class Player {
    private String name;
    private int scores;
    
    public Player(String name, int scores) {
    	this.name = name;
    	this.scores = scores;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getScore() {
    	return scores;
    }
    
    
    @Override
    public String toString() {}
        return name + " : " + score; 
}
