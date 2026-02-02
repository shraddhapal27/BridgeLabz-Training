package com.streamapi.problem4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExpiringMemberships {
    public static void main(String[] args) {
    	List<Member> members = List.of(
    			new Member("Aditya", LocalDate.now().plusDays(40)),
    			new Member("Shraddha", LocalDate.now().plusDays(15)),
    			new Member("Kridha", LocalDate.now().plusDays(31))
    			);
    	
    	members.stream().filter(m -> m.expiryDate.isBefore(LocalDate.now().plusDays(30)))
    	   .forEach(System.out::println);
    	
    }
}
