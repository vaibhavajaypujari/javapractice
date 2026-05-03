package doWhileLoop;

import java.util.Scanner;

public class OddDigitCountDoWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int count = 0;

		do {
			int digit = num % 10;

			if (digit % 2 != 0) {
				count++;
			}

			num = num / 10;

		} while (num != 0);

		System.out.println("Total odd digits = " + count);
	}
}


//example 5732