package Scanner;

import java.util.Scanner;

public class GradeCal {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Grade :");
		
		int Grade=sc.nextInt();
		
		if(Grade>=90) {
			System.out.println("Grade :- A");
		}else if(Grade>=75) {
			System.out.println("Grade :- B");
		}else if(Grade>=60) {
			System.out.println("Grade :- C");
		}else if(Grade>=45) {
			System.out.println("Grade :- D");
		}else if(Grade>=35) {
			System.out.println("Grade :- E");
		}else {
			System.out.println("Grade :- F(Fail)");
		}
		
	}

}
