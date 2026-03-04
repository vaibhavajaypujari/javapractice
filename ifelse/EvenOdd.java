package ifelse;

import java.util.Scanner;

//Even Odd

//public class EvenOdd {
//	public static void main(String[] args) {
//		int num = 15;
//		
//		if(num%2==0) {
//			System.out.println("Even Number");
//		} else {
//			
//			System.out.println("Odd Number");
//		}
//	}
//}


//public class EvenOdd{
//	public static void main(String[] args) {
//		int num = 5;
//		
//		if(num%2==0) {
//			System.out.println("Even Number");
//		}else {
//			System.out.println("Odd Number");
//		}
//	}
//}


//public class EvenOdd{
//	public static void main(String[] args) {
//		int num=17;
//		
//		if(num%2==0) {
//			System.out.println("Even num");
//		}else {
//			System.out.println("Odd num");
//		}
//	}
//}

//
//public class EvenOdd{
//public static void main(String[] args)	{
//	int num =54;
//	if(num%2==0) {
//		System.out.println("even");
//	}else {
//		System.out.println("odd");
//	}
//}
//}


//public class EvenOdd{
//	public static void main(String[] args) {
//		int num=4;
//				
//		if(num%2==0) {
//			System.out.println("this is EVEN number");
//		}else {
//			System.out.println("this is ODD nummber");
//		}
//	}
//}




public class EvenOdd{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("this is Even number");
		} else {
			System.out.println("this is Odd number");
		}
				sc.close();
	}
}