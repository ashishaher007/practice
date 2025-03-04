import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		
		boolean is = isPrime(6);
		System.out.println(is);
	}
	
	public static boolean isPrime(int num) {
		
		if (num<=1) {
			return false;
		}
		
		for (int i = 2; i <Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
