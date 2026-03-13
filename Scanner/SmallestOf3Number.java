package Scanner;

import java.util.Scanner;

public class SmallestOf3Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three number : ");
		System.out.println("A :");
		int a=sc.nextInt();
		System.out.println("B :");
		int b=sc.nextInt();
		System.out.println("C :");
		int c=sc.nextInt();
		
		if(a<=b&&a<=c) {
			System.out.println("A is Small");
		}else if(b<=a&&b<=c) {
			System.out.println("B is Small");
		}else {
			System.out.println("C is Small");
		}
	}

}
