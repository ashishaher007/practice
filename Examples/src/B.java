import java.util.Iterator;

public class B {

	public static void main(String[] args) {

		int[] arr = { 7, 1, 3, 3, 2, 5, 2, 1 };

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}

		}
		/*
		 * for (int sort : arr) { System.out.print(sort); }
		 */
		
		//remove duplicate
		int j =0;
		int temp [] = new int [arr.length];
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		
		for (int z = 0; z < j+1; z++) {
			System.out.print(temp[z]);
		}
		
	}
}
