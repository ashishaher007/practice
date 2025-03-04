//gcd of string
public class B {
	public static void main(String[] args) {

		String str1 = "ABABAB";
		String str2 = "AB";
		String gcdOfStrings = gcdOfStrings(str1, str2);
		System.out.println(gcdOfStrings);

	}

	 public static String gcdOfStrings(String str1, String str2) {
	        String bigger = str1.length() > str2.length() ? str1 : str2;
	        String smaller = str1.length() > str2.length() ? str2 : str1;

	        if (bigger.equals(smaller)) {
	            return smaller;
	        }
	        if (!bigger.startsWith(smaller)) {
	            return "";
	        }
	        
	        return gcdOfStrings(bigger.substring(smaller.length()), smaller);
	    }
}
