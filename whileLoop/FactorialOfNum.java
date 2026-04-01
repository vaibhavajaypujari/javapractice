package whileLoop;

public class FactorialOfNum {
	public static void main(String[] args) {
		int num = 5 ;
		int i = 1;
		int fact = 1;
		
		while(i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial = " + fact);
	}
}


//example

//public class FactorialOfNum{
//	public static void main(String[] args) {
//		int num = 6;
//		int i = 1;
//		int fact = 1;
//		
//		while(i <= num) {
//			fact = fact * i;
//			i++;
//		}System.out.println(fact);
//	}
//}

//example

//public class FactorialOfNum{
//	public static void main(String[] args) {
//		int num = 7;
//		int i = 1;
//		int fact = 1;
//		
//		while( i <= num ) {
//			fact = fact * i;
//			i++;
//		}System.out.println(fact);
//	}
//}