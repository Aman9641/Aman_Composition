package com.impledge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public Trie trie;
    public Deque<String[]> queue;

    public Solution() {
        trie = new Trie();
        queue = new ArrayDeque<>();
    }
    //String filePath = "C:\\Users\\amanv\\eclipse-workspace\\Word_Compositon\\src\\com\\impledge\\Input_01.txt";
    String filePath = "C:\\Users\\amanv\\eclipse-workspace\\Word_Compositon\\src\\com\\impledge\\Input_02.txt";

    public void buildTrie(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String word = line.trim();
                String[] prefixes = trie.getPrefixes(word);
                for (String prefix : prefixes) {
                    queue.addLast(new String[]{word, word.substring(prefix.length())});
                }
                trie.insert(word);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("There was some error with the file!");
            System.exit(0);
        }
    }

    public String[] findLongestCompoundWords() {
        String longestWord = "";
        int longestLength = 0;
        String secondLongest = "";

        while (!queue.isEmpty()) {
            String[] entry = queue.pollFirst();
            String word = entry[0];
            String suffix = entry[1];

            if (trie.contains(suffix) && word.length() > longestLength) {
                secondLongest = longestWord;
                longestWord = word;
                longestLength = word.length();
            } else {
                String[] prefixes = trie.getPrefixes(suffix);
                for (String prefix : prefixes) {
                    queue.addLast(new String[]{word, suffix.substring(prefix.length())});
                }
            }
        }

        return new String[]{longestWord, secondLongest};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long startTime = System.currentTimeMillis();
        solution.buildTrie("C:\\Users\\amanv\\eclipse-workspace\\Word_Compositon\\src\\com\\impledge\\Input_02.txt"); 
        String[] result = solution.findLongestCompoundWords();
        long endTime = System.currentTimeMillis();

        System.out.println("Longest Compound Word: " + result[0]);
        System.out.println("Second Longest Compound Word: " + result[1]);
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}
