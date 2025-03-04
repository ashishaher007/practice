package logestevenString;

public class NextPalindrome {
    
    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num); // Convert number to string
        String reversed = new StringBuilder(str).reverse().toString(); // Reverse string
        return str.equals(reversed); // Compare original and reversed
    }
    
    // Function to find the next palindrome
    public static int findNextPalindrome(int num) {
        num++; // Start checking from the next number
        while (!isPalindrome(num)) {
            num++; // Keep increasing until we find a palindrome
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println("Next palindrome: " + findNextPalindrome(num)); // Output: 131
    }
}

