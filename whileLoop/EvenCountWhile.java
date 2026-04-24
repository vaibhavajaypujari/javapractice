package whileLoop;

import java.util.Scanner;

public class EvenCountWhile {

	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int n= sc.nextInt();
		
		int i=1;
		int count =0;
		
		while(i<=n) {
			if(i%2==0) {
				count ++;
			}
			i++;
		}
		System.out.println("Total Even Numbers = " + count);
	} 
}
