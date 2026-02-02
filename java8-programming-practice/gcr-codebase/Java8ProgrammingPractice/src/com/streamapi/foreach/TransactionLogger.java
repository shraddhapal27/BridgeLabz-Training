package com.streamapi.foreach;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionLogger {
    public static void main(String[] args) {
    	
    	List<Integer> list = List.of(01, 11 , 010 , 45);
    	list.forEach(id -> System.out.println(LocalDate.now() + " Transaction - " + list));
    }
}
