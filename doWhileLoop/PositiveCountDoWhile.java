package doWhileLoop;

import java.util.Scanner;

public class PositiveCountDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int num;

		do {
			System.out.println("Enter a number (0 to Stop) : ");
			num = sc.nextInt();

			if (num > 0) {
				count++;
			}
		} while (num != 0);

		System.out.println("Total positive numbers = " + count);

	}
}
