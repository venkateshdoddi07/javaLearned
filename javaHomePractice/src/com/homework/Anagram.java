package com.homework;

public class Anagram {
	   public static void main(String[] args) {
	       // Input strings
	       String s1 = "eat";
	       String s2 = "tea";
	       // Step 1: Check if lengths are equal
	       // If lengths are not equal, they cannot be anagrams
	       if (s1.length() != s2.length()) {
	           System.out.println("Not Anagram");
	           return; // stop execution
	       }
	       // Step 2: Assume strings are anagrams initially
	       boolean isAnagram = true;
	       // Step 3: Traverse each character of first string
	       for (int i = 0; i < s1.length(); i++) {
	           // Take one character from s1
	           char ch1 = s1.charAt(i);
	           // Initialize counters for both strings
	           int count1 = 0;
	           int count2 = 0;
	           // Step 4: Count occurrences of ch1 in s1
	           for (int j = 0; j < s1.length(); j++) {
	               if (ch1 == s1.charAt(j)) {
	                   count1++; // increment count in s1
	               }
	           }
	           // Step 5: Count occurrences of same character in s2
	           for (int j = 0; j < s2.length(); j++) {
	               if (ch1 == s2.charAt(j)) {
	                   count2++; // increment count in s2
	               }
	           }
	           // Step 6: Compare counts
	           // If counts are not equal, not an anagram
	           if (count1 != count2) {
	               isAnagram = false; // mark as not anagram
	               break; // exit loop early
	           }
	       }
	       // Step 7: Final result
	       if (isAnagram) {
	           System.out.println("Anagram");
	       } else {
	           System.out.println("Not Anagram");
	       }
	   }
	}
