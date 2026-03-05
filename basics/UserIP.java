package basics;

import java.util.Scanner;

public class UserIP {
	public static void main(String[]args) {
		//scanner object (user input)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name : ");
		
		String name=sc.next();
		System.out.println("Hello "+name);
	}
}



