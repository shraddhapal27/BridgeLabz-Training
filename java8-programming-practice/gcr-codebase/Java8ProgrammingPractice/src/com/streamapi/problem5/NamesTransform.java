package com.streamapi.problem5;

import java.util.ArrayList;
import java.util.List;

public class NamesTransform {
    public static void main(String[] args) {
    	List<String> names = new ArrayList<>();
    	names.add("Bhumika");
    	names.add("Yukti");
    	names.add("Disha");
    	names.add("Rashi");
    	
    	names.stream().map(a -> a.toUpperCase()).sorted().forEach(System.out::println);;
    }
}
