package whileLoop;

import java.util.Scanner;

public class PrimeWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

		int i = 2;
		boolean isPrime = true;

		while (i <= num / 2) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
			i++;

		}
		if (isPrime && num > 1)
			System.out.println("prime number");
		else {
			System.out.println("Not a Prime Number");
		}
	}
}