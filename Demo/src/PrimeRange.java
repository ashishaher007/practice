
public class PrimeRange {

	public static void main(String[] args) {

		int num = 100;
		int count = 0;
		for (int i = 0; i <= num; i++) {

			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;

	}
}
