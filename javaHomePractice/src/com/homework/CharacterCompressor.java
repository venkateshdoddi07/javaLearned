package com.homework;

import java.util.Scanner;
public class CharacterCompressor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Prompt user for input
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		// Get the compressed result
		String output = compressRepeatedCharacters(input);
		// Display the output
		System.out.println("Output: " + output);
		scanner.close();
	}
	public static String compressRepeatedCharacters(String str) {
		StringBuilder result = new StringBuilder();
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			// If the next character is the same, increase the count
			if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				// Append the current character and its count
				result.append(str.charAt(i)).append(count);
				count = 1; // Reset count for the next character
			}
		}
		return result.toString();
	}
}
