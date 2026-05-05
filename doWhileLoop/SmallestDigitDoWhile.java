package doWhileLoop;

import java.util.Scanner;

public class SmallestDigitDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int min = 9;

		do {
			int digit = num % 10;

			if (digit < min) {
				min = digit;
			}

			num = num / 10;

		} while (num != 0);

		System.out.println("Smallest digit = " + min);
	}
}
