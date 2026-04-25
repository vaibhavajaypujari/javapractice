package doWhileLoop;

import java.util.Scanner;

public class PrimeDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int i = 2;
		boolean isPrime = true;

		if (num > 1) {
			do {
				if (num % i == 0 && i != num) {
					isPrime = false;
					break;
				}
				i++;
			} while (i <= num / 2);
		}
		if (isPrime && num > 1)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}
