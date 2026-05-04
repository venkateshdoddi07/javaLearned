package com.homework.collectionframeworkconcept;

//Node structure of Trie
class TrieNode {

 // Each node can have up to 26 children (a to z)
 TrieNode[] children = new TrieNode[26];

 // Marks whether this node is end of a valid word
 boolean isEndOfWord;

 public TrieNode() {
     isEndOfWord = false;

     // Initialize all children as null
     for (int i = 0; i < 26; i++) {
         children[i] = null;
     }
 }
}

//Trie class containing operations
class Trie {

 TrieNode root;

 public Trie() {
     // Root is an empty node
     root = new TrieNode();
 }

 // INSERT operation
 public void insert(String word) {
     TrieNode node = root;

     for (char ch : word.toCharArray()) {
         int index = ch - 'a'; // convert character to index (0–25)

         // If path doesn't exist, create new node
         if (node.children[index] == null) {
             node.children[index] = new TrieNode();
         }

         // Move to next node
         node = node.children[index];
     }

     // Mark end of word
     node.isEndOfWord = true;
 }

 // SEARCH operation
 public boolean search(String word) {
     TrieNode node = root;

     for (char ch : word.toCharArray()) {
         int index = ch - 'a';

         // If path breaks, word doesn't exist
         if (node.children[index] == null) {
             return false;
         }

         node = node.children[index];
     }

     // Check if it's actually a complete word
     return node.isEndOfWord;
 }

 // PREFIX CHECK operation
 public boolean startsWith(String prefix) {
     TrieNode node = root;

     for (char ch : prefix.toCharArray()) {
         int index = ch - 'a';

         // If path breaks, prefix doesn't exist
         if (node.children[index] == null) {
             return false;
         }

         node = node.children[index];
     }

     return true;
 }
}

//Main class to test Trie
public class Main {
 public static void main(String[] args) {

     Trie trie = new Trie();

     // Insert words into Trie
     trie.insert("cat");
     trie.insert("car");
     trie.insert("dog");

     // Search words
     System.out.println(trie.search("cat"));    // true
     System.out.println(trie.search("cap"));    // false

     // Prefix check
     System.out.println(trie.startsWith("ca")); // true
 }
}
