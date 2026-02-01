package com.lambdaexpression.problem5;

import java.util.Arrays;
import java.util.List;

public class NameUppercasting {

	public static void main(String[] args) {
		List<String> employeeNames = Arrays.asList("Aadi", "Shraddha","Sukuna");
	   	employeeNames.stream().map(String::toUpperCase).toList().forEach(System.out::println);
	}
}
