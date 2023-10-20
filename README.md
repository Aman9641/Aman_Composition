
# Word_Composition_Aman

# Introduction

A Trie is a tree-like data structure used for efficiently storing and searching for strings. It is particularly useful for tasks like autocompletion, spell checking, and prefix matching. The core components of this implementation are the TrieNode class and the Trie class.
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




## Deployment

To deploy this project run

```bash
    character: The character associated with the node.
    children: A HashMap that maps characters to their corresponding child nodes.
    isTerminal: A boolean flag indicating whether the current node represents the end of a valid word.
```

## Color Reference

| Color             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
| Example Color | ![#0a192f](https://via.placeholder.com/10/0a192f?text=+) #0a192f |
| Example Color | ![#f8f8f8](https://via.placeholder.com/10/f8f8f8?text=+) #f8f8f8 |
| Example Color | ![#00b48a](https://via.placeholder.com/10/00b48a?text=+) #00b48a |
| Example Color | ![#00d1a0](https://via.placeholder.com/10/00b48a?text=+) #00d1a0 |


## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)


## Appendix

Any additional information goes here

