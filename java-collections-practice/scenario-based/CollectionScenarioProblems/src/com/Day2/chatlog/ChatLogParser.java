package com.Day2.chatlog;


import java.io.*;
import java.util.*;
import java.util.regex.*;

class ChatLogParser {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("chat.txt"));
        String line;

        Map<String, List<String>> userMap = new TreeMap<>();

        Pattern p = Pattern.compile("\\[(.*?)\\] (.*?): (.*)");

        while ((line = br.readLine()) != null) {
            Matcher m = p.matcher(line);

            if (m.matches()) {
                String user = m.group(2);
                String msg = m.group(3);

                if (msg.contains("lol") || msg.contains("brb")) continue;

                userMap.putIfAbsent(user, new ArrayList<>());
                userMap.get(user).add(msg);
            }
        }

        br.close();
        System.out.println(userMap);
    }
}