
public class IsPallindrome {

	public static void main(String[] args) {
		String str = "12321";
		String reversed = "";
		/*
		 * StringBuilder sb = new StringBuilder(str); StringBuilder reverse =
		 * sb.reverse();
		 */
		for (int i = str.length() - 1; i >= 0; i--) {

			//System.out.print(str.charAt(i));
			reversed += str.charAt(i);
		}
		System.out.println(reversed);
		
		if (reversed.equals(str)) {
			System.out.println("is Pallindrome.");
		}else {
			System.out.println("Not Pallindrome");
		}
	}

}
