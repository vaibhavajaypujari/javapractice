package Scanner;

import java.util.Scanner;

public class CheckZero {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter One Number :");
	int num=sc.nextInt();
	
	if(num==0) {
		System.out.println("This Number is ZERO");
	}else {
		System.out.println("This Number is Not ZERO");
	}
}
}


//practice


//public class CheckZero{
//	public static void main(String [] args ) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number : ");
//		int num=sc.nextInt();
//		if(num==0) {
//			System.out.println("this num is ZERO");
//		}else {
//			System.out.println("this num is not ZERO");
//		}
//		
//	}
//}
