package whileLoop;

import java.util.Scanner;

public class PositiveCountWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int num = 1;

		while (num != 0) {
			System.out.println("Enter a Number (0 to Stop): ");
			num = sc.nextInt();

			if (num > 0) {
				count++;
			}
		}
		System.out.println("total positive number = " + count);
	}
}
