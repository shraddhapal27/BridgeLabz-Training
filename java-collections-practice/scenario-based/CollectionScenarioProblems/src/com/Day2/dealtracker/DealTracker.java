package com.Day2.dealtracker;

import java.io.*;
import java.util.*;
import java.util.regex.*;

class DealTracker {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("deal.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Map<String, Deal> dealMap = new HashMap<>();
        Set<String> codes = new HashSet<>();

        String line, code="", discount="";

        while ((line = br.readLine()) != null) {

            if (line.startsWith("DealCode"))
                code = line.split(":")[1].trim();

            if (line.startsWith("Discount"))
                discount = line.replaceAll("\\D", "");

            if (!code.isEmpty() && !discount.isEmpty()) {
                if (!codes.contains(code)) {
                    dealMap.put(code, new Deal(code,
                            Integer.parseInt(discount)));
                    codes.add(code);
                }
                code = "";
                discount = "";
            }
        }

        br.close();
        System.out.println("Deals loaded");
    }
}