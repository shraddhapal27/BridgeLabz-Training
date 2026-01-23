package com.exceptionhandling.trywithresources;


import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class TryWithResourcesExample {
    public static void main(String[] args) {
    
    	try {
    		FileReader file = new FileReader("info.txt");
            BufferedReader br = new BufferedReader(file);
            
            String line = br.readLine();
            if(line != null) {
            	System.out.println(line);
            }
    	}catch(IOException e) {
    		System.out.println("File not found!!");
    	}
    	
    }
}
