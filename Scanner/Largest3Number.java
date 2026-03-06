package Scanner;

import java.util.Scanner;

public class Largest3Number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the Numbers : ");
		int A= sc.nextInt();
		int B= sc.nextInt();
		int C= sc.nextInt();
		
		if(A>=B&&A>=C) {
			System.out.println("A is largest");
		}else if(B>=A&&B>=C) {
			System.out.println("B is largest");
		} else {
			System.out.println("C is largest");
		}
	}
}
