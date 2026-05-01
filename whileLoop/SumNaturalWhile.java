package whileLoop;

import java.util.Scanner;

public class SumNaturalWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int i = 1;
		int sum = 0;

		while (i <= n) {
			sum = sum + i;
			i++;
		}

		System.out.println("Sum = " + sum);
	}
}
