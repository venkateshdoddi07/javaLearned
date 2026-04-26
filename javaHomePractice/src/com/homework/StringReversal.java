package com.homework;


	public class StringReversal {
		public static String reverseString(String str) {
			// Create an empty string to store the reversed result
			String reversed = "";
			// Iterate through the original string from the end
			for (int i = str.length() - 1; i >= 0; i--) {
				// Extract the character at the current index
				char currentChar = str.charAt(i);
				// Append the character to the reversed string
				reversed += currentChar;
			}
			return reversed;
		}
		public static void main(String[] args) {
			String input = "hello";
			System.out.println("Reversed String: " + reverseString(input));
		}
	}


