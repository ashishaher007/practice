package logestevenString;

import java.util.Arrays;

public class LongestEvenWord {

	public static int longestEvenWordLength(String str) {

		return Arrays.stream(str.split("\\s+")) // Split the string into words
				.filter(word -> word.length() % 2 == 0) // Keep only even-length words
				.mapToInt(String::length) // Convert words to their lengths
				.max() // Find the maximum length
				.orElse(0); // Return 0 if no even-length word is found
	}
	
	public static int longestEvenWordLength1(String str) {
        String[] words = str.split(" "); // Split the string into words
        int maxLength = 0; // Variable to store the longest even-length word

        for (String word : words) { // Loop through each word
            if (word.length() % 2 == 0) { // Check if the word length is even
                maxLength = Math.max(maxLength, word.length()); // Update maxLength if this word is longer
            }
        }

        return maxLength; // Return the length of the longest even-length word
    }

	public static void main(String[] args) {

		String input = "Hello world Javajava java programming is awesome";
		int maxEvenLength = longestEvenWordLength1(input);
		System.out.println("Length of the longest even-length word: " + maxEvenLength);
	}
}
