package day01;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "margana";

        if(str1.length() != str2.length()){
            System.out.println("Invalid characters");
        }
        else{
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                System.out.println("Anagrams");
            }else{
                System.out.println("They are not anagrams");
            }
        }


    }
}
