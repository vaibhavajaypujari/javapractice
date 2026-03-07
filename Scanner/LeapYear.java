package Scanner;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner lp =new Scanner(System.in);
	System.out.println("enter year");
	int year=lp.nextInt();
	
	if(year%4==0) {
		System.out.println("this is a leap year");
	}else 
	{
		System.out.println("this is not leap year");
	}
}
}
