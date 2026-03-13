package Scanner;

import java.util.Scanner;

public class SamllestOf2Numbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two Number :");
		System.out.println("A :");
		int A=sc.nextInt();
		System.out.println("B :");
		int B=sc.nextInt();
		
		if(A<B) {
			System.out.println("A is Small");
		}else {
			System.out.println("B is Small");
		}
	}

}
