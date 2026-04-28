package doWhileLoop;

import java.util.Scanner;

public class LargestDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int max = Integer.MIN_VALUE;

		do {
			System.out.println("Enter a number (0 to stop): ");
			num = sc.nextInt();

			if (num > max) {
				max = num;
			}
		} while (num != 0);
		System.out.println("Largest number = " + max);
	}
}
