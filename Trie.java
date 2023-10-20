package com.impledge;


import java.util.HashMap;

class TrieNode {
    char character;
    HashMap<Character, TrieNode> children;
    boolean isTerminal;

    public TrieNode(char character) {
        this.character = character;
        this.children = new HashMap<>();
        this.isTerminal = false;
    }
}

class Trie {
    public TrieNode root;

    public Trie() {
        root = new TrieNode(' ');
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (!current.children.containsKey(c)) {
                current.children.put(c, new TrieNode(c));
            }
            current = current.children.get(c);
        }
        current.isTerminal = true;
    }

    public boolean contains(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return false;
            }
            current = current.children.get(c);
        }
        return current.isTerminal;
    }

    public String[] getPrefixes(String word) {
        String prefix = "";
        TrieNode current = root;
        String[] prefixes = new String[0];

        for (char c : word.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return prefixes;
            }
            current = current.children.get(c);
            prefix += c;
            if (current.isTerminal) {
                String[] newPrefixes = new String[prefixes.length + 1];
                System.arraycopy(prefixes, 0, newPrefixes, 0, prefixes.length);
                newPrefixes[prefixes.length] = prefix;
                prefixes = newPrefixes;
            }
        }
        return prefixes;
    }
}
