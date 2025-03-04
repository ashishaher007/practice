package logestevenString;

public class GCDOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        // If concatenation in different orders is not equal, no common divisor
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Compute the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring of str1 from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Function to calculate GCD using Euclidean algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); // Output: "AB"
        System.out.println(gcdOfStrings("ABCABC", "ABC"));  // Output: "ABC"
        System.out.println(gcdOfStrings("LEET", "CODE"));   // Output: ""
    }
}

