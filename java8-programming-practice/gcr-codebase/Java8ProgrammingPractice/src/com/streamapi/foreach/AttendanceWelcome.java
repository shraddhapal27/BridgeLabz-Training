package com.streamapi.foreach;

import java.util.List;

public class AttendanceWelcome {

	public static void main(String[] args) {
		List<String> names = List.of("Kridha", "Shraddha", "Aadi");
		names.forEach(name -> System.out.println("Welcome," + name + "!"));
	}

}
