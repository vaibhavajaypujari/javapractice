package whileLoop;

public class SumOfEvenNum {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		
		while (i<=10) {
			sum=sum+i;
			i=i+2;
			i++;
		}
		System.out.println("Sum ="+ sum);
	}
}

//example

//public class SumOfEvenNum{
//	public static void main (String[] args) {
//		int i=1;
//		int sum=0;
//		
//	while(i<=50) {
//		sum=sum+i;
//		i=i+2;
//	}System.out.println(sum);
//	}
//}

//example
//public class SumOfEvenNum{
//	public static void main(String[] args ){
//		int i=1;
//		int sum=0;
//		while(i<=100) {
//			sum=sum+i;
//			i=i+2;
//		}System.out.println(sum);
//	}
//}