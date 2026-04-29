package whileLoop;

import java.util.Scanner;

public class FibonacciWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of terms: ");
		int n = sc.nextInt();

		int a = 0, b = 1, i = 1;

		while (i <= n) {
			System.out.println(a + " ");
			int c = a + b;
			a = b;
			b = c;
			i++;
		}
	}
}
