package day01;

import java.util.Arrays;

public class SherlockAndAnagrams {
    public static void main(String[] args) {
        String s = "abba";
        // first substring
        int count = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String sub1 = s.substring(i,j+1);

                // second substring
                for(int k=i+1; k<s.length(); k++) {
                    for (int l = k; l < s.length(); l++) {
                        String sub2 = s.substring(k, l + 1);

                        if (sub1.length() == sub2.length()) {
                            char ch1[] = sub1.toCharArray();
                            char ch2[] = sub2.toCharArray();

                            Arrays.sort(ch1);
                            Arrays.sort(ch2);

                            if (Arrays.equals(ch1, ch2)) {
                                count++;
                            }
                        }
                    }
                }}}
    System.out.println(count);
    }}
