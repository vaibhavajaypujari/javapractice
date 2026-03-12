package Scanner;

import java.util.Scanner;

public class Temperature {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Current Temperature");
	int temp=sc.nextInt();
	
	if(temp>30) {
		System.out.println("temp is HIGH");
	}else if(temp>18) {
		System.out.println("temp is MEDIUM");
	}else {
		System.out.println("temp is LOW");
	}
}
}
