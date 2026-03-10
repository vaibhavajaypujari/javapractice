package Scanner;
import java.util.Scanner;

public class DividedByFive {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the any number : ");
	int num = sc.nextInt();
	
	if(num%5==0) {
		System.out.println("Divided by five");
	}else {
		System.out.println("not Divided by five");
	}
}
}


// practice 
//eg.1

//public class DividedByFive{
//	public static void main(String[] args) {
//		Scanner dy= new Scanner(System.in);
//		
//		System.out.println("Enter any number");
//		int num=dy.nextInt();
//		
//		if(num%9==0) {
//			System.out.println("Divided by 9");
//		}else {
//			System.out.println("not Divided by 9");
//		}
//	}
//}


//eg.2

//public class DividedByFive{
//	public static void main(String [] args) {
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("enter the number : ");
//		int num=sc.nextInt();
//		
//		if(num%2==0) {
//			System.out.println("divided by 2");
//		}else {
//			System.out.println("not divided by 2");
//		}
//	}
//}