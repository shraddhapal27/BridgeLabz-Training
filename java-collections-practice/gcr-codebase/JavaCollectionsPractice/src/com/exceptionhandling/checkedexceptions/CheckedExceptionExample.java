package com.exceptionhandling.checkedexceptions;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
    	try {
    		//try to read this file
    		FileReader file = new FileReader("data.txt");
    		BufferedReader br = new BufferedReader(file);
    		
    		String line;
    		while((line = br.readLine()) != null) {
    			System.out.println(line);
    		}
    		br.close();
    	}catch(IOException e) {
    		// handle checked exeption
    		System.out.println("File not found!!");
    	}
    }
}
