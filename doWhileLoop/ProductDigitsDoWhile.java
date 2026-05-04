package doWhileLoop;

import java.util.Scanner;

public class ProductDigitsDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int product = 1;

		do {
			int digit = num % 10;
			product = product * digit;
			num = num / 10;

		} while (num != 0);

		System.out.println("Product of digits = " + product);
	}
}
