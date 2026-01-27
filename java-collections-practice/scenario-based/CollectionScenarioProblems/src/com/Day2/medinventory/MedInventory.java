package com.Day2.medinventory;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class MedInventory {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));
        String line;
        Set<Item> uniqueItems = new HashSet<>();
        Map<String, List<Item>> categorized = new HashMap<>();

        Pattern datePattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            Matcher m = datePattern.matcher(data[3]);

            if (m.matches()) {
                LocalDate expiry = LocalDate.parse(data[3], formatter);
                Item item = new Item(data[0], data[1], "Medical", Integer.parseInt(data[2]), expiry);

                uniqueItems.add(item);
                categorized.computeIfAbsent(item.type, k -> new ArrayList<>()).add(item);

                if (item.quantity < 10)
                    throw new LowStockException("Critical low stock: " + item.name);
            }
        }
        br.close();
    }
}
