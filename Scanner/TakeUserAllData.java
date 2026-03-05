package Scanner;

import java.util.Scanner;

public class TakeUserAllData {
	
	public static void main(String[]args) {
	//scanner method used (from all data input from user
	Scanner sc=new Scanner(System.in);
	System.out.println("Fill the All Valid Details :");
	
	System.out.println("Emp Name:");
	String name=sc.nextLine();
	
	System.out.println("Emp Age:");
	int age=sc.nextInt();
	
	System.out.println("Job Role:");
	String role=sc.next();
	
	System.out.println("Emp Sal:");
	double sal=sc.nextDouble();
	
	System.out.println("Job Location:");
	String city=sc.next();
	
	//this is sort  
//	System.out.println("Employee Details : "+name+"\n"+age+" "+role+" "+sal+" "+city);	

	
	System.out.println("Employee Details : ");
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("Job Role : "+role);
	System.out.println("Salary : "+sal);
	System.out.println("Job Location : "+city);
	
	sc.close();

}
}