package Scanner;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Final Marks:");
		int marks=sc.nextInt();
		
		if(marks>=35) {
			System.out.println("Congratulations.........you are PASS...!");
		}else {
			System.out.println("Sorry...........you are Fail...!");
		}
	}
}
