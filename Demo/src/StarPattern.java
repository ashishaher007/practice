import java.util.Iterator;

public class StarPattern {

	public static void main(String[] args) {

		int n = 5; // Number of rows

		for (int i = 0; i < n; i++) { // Rows
			for (int j = 0; j < n; j++) { // Columns
				if (i == 4 && j == 4) { // Remove last '*' in the last row
					System.out.print("  "); // Print space instead of '*'
				} else {
					System.out.print("* ");
				}
			}
			System.out.println(); // Move to the next line
		}
	}
}
