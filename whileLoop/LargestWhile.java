package whileLoop;

import java.util.Scanner;

public class LargestWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 1;
		int max = Integer.MIN_VALUE;

		while (num != 0) {
			System.out.println("Enter a number (0 to stop): ");
			num = sc.nextInt();

			if (num > max) {
				max = num;
			}
		}
		System.out.println("Largest number = " + max);
	}
}
