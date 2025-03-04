import java.util.Iterator;

public class PrimeRange {

	public static void main(String[] args) {
		int n = 100;

		int count = 0;

		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				System.out.print(i + ",");
				count++;
			}
		}

		System.out.println("count is {}:" + count);
	}

	// function to check if a given number is prime
	static boolean isPrime(int n) {
		// since 0 and 1 is not prime return false.
		if (n == 1 || n == 0)
			return false;

		// Run a loop from 2 to n-1
		for (int i = 2; i <= n / 2; i++) {
			// if the number is divisible by i, then n is not a prime number.
			if (n % i == 0) {
				return false;
			}
		}
		// otherwise, n is prime number.
		return true;
	}
}
