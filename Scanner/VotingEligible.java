package Scanner;

import java.util.Scanner;

public class VotingEligible {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Current Age : ");
	int age=sc.nextInt();
	
	if(age>=18) {
		System.out.println("You Are Eligilbe For Voting");
	}else {
		System.out.println("You Are Not Eligible For Voting");
	}
}
}
