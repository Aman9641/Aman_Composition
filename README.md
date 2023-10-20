# Word_Composition_Aman
To find words constructed by concatenating shorter words also found in the file.

#Input (files)
  Input_01.txt
  Input_02.txt
#Output_01
  ratcatdogcat catsdogcats
#Output_02
  ethylenediaminetetraacetates  electroencephalographically

# Introduction

A Trie is a tree-like data structure used for efficiently storing and searching for strings. It is particularly useful for tasks like autocompletion, spell checking, and prefix matching. The core components of this implementation are the TrieNode class and the Trie class.

#Approach
  Used Trie data structure its a special tree that stores strings. Maximum number of children of a node is equal to size of alphabet. Trie supports search, insert
  and delete operations in O(k) time where k is length of key/word. This is obviously faster than BST and Hashing. and we can efficiently do Prefix search.

## Trie Class
The Trie class serves as the root of the Trie data structure. It has the following key methods:

insert(String word): Inserts a word into the Trie.
contains(String word): Checks if a word exists in the Trie.
getPrefixes(String word): Retrieves all prefixes of a given word.

## Usage
To use this Trie implementation, follow these steps:

Create a Trie object using Trie trie = new Trie();.
Insert words into the Trie using the insert(String word) method.
Check if a word exists in the Trie using the contains(String word) method.
Obtain all prefixes of a word using the getPrefixes(String word) method.
