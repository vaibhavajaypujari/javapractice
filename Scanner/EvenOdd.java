package Scanner;

import java.util.Scanner;

//public class EvenOdd {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter The Number : ");
//		
//		int num=sc.nextInt();
//		
//		if(num%2==0) {
//			System.out.println("This Number is EVEN........!");
//		}else {
//			System.out.println("This Number is ODD........!");
//		}
//	}
//
//}
//

//Practice
//eg.1

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number"); 
		
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}