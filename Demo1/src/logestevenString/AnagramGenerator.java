package logestevenString;

import java.util.HashSet;
import java.util.Set;

public class AnagramGenerator {

    // Function to generate all anagrams of a given string
    public static Set<String> generateAnagrams(String str) {
        Set<String> anagrams = new HashSet<>();
        generateAnagramsHelper(str, "", anagrams);
        return anagrams;
    }

    // Helper function for recursion
    private static void generateAnagramsHelper(String str, String prefix, Set<String> anagrams) {
        if (str.length() == 0) {
            anagrams.add(prefix);  // Add the generated anagram to the set
        } else {
            for (int i = 0; i < str.length(); i++) {
                // Generate all possible combinations by taking one character at a time
                String rem = str.substring(0, i) + str.substring(i + 1);  // Remove the character at index i
                generateAnagramsHelper(rem, prefix + str.charAt(i), anagrams);  // Recur with the remaining string
            }
        }
    }

    // Main method to test the anagram generator
    public static void main(String[] args) {
        String input = "abc";  // Example input
        Set<String> anagrams = generateAnagrams(input);
        System.out.println("Anagrams of " + input + ": " + anagrams);
    }
}
