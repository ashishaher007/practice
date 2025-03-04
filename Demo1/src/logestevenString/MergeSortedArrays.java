package logestevenString;

import java.util.*;

public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // Convert arrays to lists
        List<Integer> mergedList = new ArrayList<>();
        
        // Add elements from both arrays
        for (int num : arr1) {
            mergedList.add(num);
        }
        for (int num : arr2) {
            mergedList.add(num);
        }

        // Sort the merged list
        Collections.sort(mergedList);

        // Convert list back to int[]
        return mergedList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }
}
