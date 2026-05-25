package Imp;

public class SmallestElement {

	public static void main(String[] args) {

		int[] arr = { 45, 12, 78, 3, 56 };

		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		System.out.println("Smallest Element: " + smallest);
	}
}
