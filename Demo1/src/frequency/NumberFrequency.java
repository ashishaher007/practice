package frequency;

import java.util.*;

public class NumberFrequency {
    public static void printFrequency(int[] arr) {
        // Step 1: Create a HashMap to store frequency
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 2: Count occurrences of each number
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Find the max and min frequency values
        int maxValue = Collections.max(frequencyMap.values());
        int minValue = Collections.min(frequencyMap.values());

        // Step 4: Find all numbers with max and min frequency
        List<Integer> maxKeys = new ArrayList<>();
        List<Integer> minKeys = new ArrayList<>();

        System.out.println("Number Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");

            if (entry.getValue() == maxValue) {
                maxKeys.add(entry.getKey());
            }
            if (entry.getValue() == minValue) {
                minKeys.add(entry.getKey());
            }
        }

        // Step 5: Print numbers with max and min frequency
        System.out.println("Numbers with max frequency (" + maxValue + " times): " + maxKeys);
        System.out.println("Numbers with min frequency (" + minValue + " times): " + minKeys);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 1, 4, 5, 6, 2, 3, 4, 5, 5};
        printFrequency(numbers);
    }
}
