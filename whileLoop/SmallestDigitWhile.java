package whileLoop;

import java.util.Scanner;

public class SmallestDigitWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int min = 9;

		while (num != 0) {
			int digit = num % 10;

			if (digit < min) {
				min = digit;
			}

			num = num / 10;
		}

		System.out.println("Smallest digit = " + min);
	}
}
