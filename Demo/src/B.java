import java.util.Iterator;

public class B {

	public static void main(String[] args) {
		int x[] = { 3, 1, 3, 2, 3, 2, 21 };

		for (int j = 0; j < x.length - 1; j++) {
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] > x[i + 1]) {
					int temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
				}
			}
		}

		for (int i : x) {
			System.out.print(i + " ");
		}
		int[] temp = new int[x.length];
		int j = 0;
		for (int i = 0; i < x.length - 1; i++) {

			if (x[i] != x[i + 1]) {
				temp[j] = x[i];
				j++;
			}

		}

		System.out.println();
		temp[j] = x[x.length - 1];
		for (int z = 0; z < j + 1; z++) {
			System.out.print(temp[z] + " ");
		}
	}
}
