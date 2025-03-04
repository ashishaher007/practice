package logestevenString;

import java.util.*;

public class CharFrequency {
	public static void printFrequency(String str) {
		// Step 1: Create a HashMap to store character frequencies
		Map<Character, Integer> frequencyMap = new HashMap<>();

		// Step 2: Count occurrences of each character
		for (char ch : str.toCharArray()) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}

		// Step 3: Find the max and min frequency values
		int maxValue = Collections.max(frequencyMap.values());
		int minValue = Collections.min(frequencyMap.values());

		// Step 4: Find all characters with max and min frequency
		List<Character> maxKeys = new ArrayList<>();
		List<Character> minKeys = new ArrayList<>();

		System.out.println("Character Frequencies:");
		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			System.out.println("'" + entry.getKey() + "' appears " + entry.getValue() + " times");

			if (entry.getValue() == maxValue) {
				maxKeys.add(entry.getKey());
			}
			if (entry.getValue() == minValue) {
				minKeys.add(entry.getKey());
			}
		}

		// Step 5: Print characters with max and min frequency
		System.out.println("Characters with max frequency (" + maxValue + " times): " + maxKeys);
		System.out.println("Characters with min frequency (" + minValue + " times): " + minKeys);
	}

	public static void main(String[] args) {
		String input = "hello world";
		printFrequency(input);
	}
}
