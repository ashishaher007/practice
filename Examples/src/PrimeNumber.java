
public class PrimeNumber {

	public static void main(String args[]) {
		int n = 6;
		if (isPrime(n)) {
			System.out.println(n + "  isPrime");
		} else {
			System.out.println(n + "  Not Prime");
		}

	}

	static boolean isPrime(int n) {
		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}
}
