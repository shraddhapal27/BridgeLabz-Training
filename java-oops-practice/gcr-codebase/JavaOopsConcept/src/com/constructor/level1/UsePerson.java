package com.constructor.level1;

public class UsePerson {
	 public static void main(String[] args) {

	        // Original object
	        Person p1 = new Person("Shraddha", 21);
	        p1.display();

	        // Cloned object using copy constructor
	        Person p2 = new Person(p1);
	        p2.display();
	    }
}
