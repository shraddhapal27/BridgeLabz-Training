package com.Day2.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

class ExamResultUploader {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("marks.csv"));
        String line;

        Map<String, List<Integer>> subjectMap = new HashMap<>();
        Pattern p = Pattern.compile("\\d+,\\w+,\\w+,\\d+");

        while ((line = br.readLine()) != null) {

            // Create matcher after reading line
            Matcher matcher = p.matcher(line);

            if (!matcher.matches()) {
                throw new RuntimeException("Invalid format");
            }

            String[] data = line.split(",");
            String subject = data[2];
            int marks = Integer.parseInt(data[3]);

            subjectMap.putIfAbsent(subject, new ArrayList<>());
            subjectMap.get(subject).add(marks);
        }

        for (String sub : subjectMap.keySet()) {
            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(subjectMap.get(sub));

            System.out.println(sub + " Topper: " + pq.peek());
        }

        br.close();
    }
}
