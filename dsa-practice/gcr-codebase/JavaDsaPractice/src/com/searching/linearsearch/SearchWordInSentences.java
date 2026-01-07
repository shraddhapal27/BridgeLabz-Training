package com.searching.linearsearch;

public class SearchWordInSentences {

    // Method to find first sentence containing the word
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is fun",
            "I love programming",
            "Linear search is simple",
            "Data Structures are important"
        };

        String word = "enjoy";

        String result = findSentence(sentences, word);

        System.out.println("Result: " + result);
    }
}
