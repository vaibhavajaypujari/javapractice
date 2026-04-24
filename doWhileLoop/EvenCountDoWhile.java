package doWhileLoop;

import java.util.Scanner;

public class EvenCountDoWhile {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int i =1;
		int count=0;
		
		do {
			if(i%2==0) {
				count++;
			}
			i++;
		}
		while(i <= n);
		
		System.out.println("Total Even Numbers = " + count);
		
	}
}
