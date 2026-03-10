package Scanner;

import java.util.Scanner;

public class PositiveNegative {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number : ");
	int num=sc.nextInt();
	
	if(num>0) {
		System.out.println("This Num is Positive");
	}else {
		System.out.println("This Num is Negative");
	}
}
}

//Positive Negative Number 
