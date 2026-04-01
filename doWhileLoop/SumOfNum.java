package doWhileLoop;

public class SumOfNum {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		
		do {
			sum=sum+i;
			i++;
		} while(i<=15);
		System.out.println("sum = "+sum);
	}
}


//example
//public class SumOfNum{
//	
//
//public static void main(String[] args) {
//	int i=1; 
//	int sum= 0;
//	do { 
//		sum=sum+i;
//		i++;
//	}while(i<=150);
//	System.out.println("Sum = "+sum);
//}
//}