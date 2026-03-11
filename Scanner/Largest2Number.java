package Scanner;

import java.util.Scanner;

public class Largest2Number {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A:- ");
	int a=sc.nextInt();
	System.out.println("Enter B:-");
	int b=sc.nextInt();
	
	if(a>b) {
		System.out.println("A is Largest Number");
	}else {
		System.out.println("B is Largest Number");
	}
}
}
