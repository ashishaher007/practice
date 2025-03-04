package logestevenString;

public class MaxSubarraySum {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;  // Store the maximum sum found
        int currentSum = 0;              // Store the current subarray sum
        
        for (int num : nums) {
            currentSum += num;  // Add the current number
            
            maxSum = Math.max(maxSum, currentSum);  // Update maxSum if needed
            
            if (currentSum < 0) {
                currentSum = 0;  // Reset currentSum if it becomes negative
            }
        }
        
        return maxSum;  // Return the maximum subarray sum
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum sum: " + maxSubArray(nums));  // Output: 6
    }
}

