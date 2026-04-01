package doWhileLoop;

public class CountDigit {
public static void main(String[] args) {
	int num= 12345;
	int count=0;
	
	do {
		num=num/10;
		count++;
	}
	while(num !=0);
	System.out.println("Total Digits = "+ count);
}
}



//example


//public class CountDigit{
//public static void main(String[] args) {
//	int num= 123454554;
//	int count=0;
//	
//	do {
//		num=num/10;
//		count++;
//	}while(num!=0);
//	System.out.println( count);
//}
//}


//example

//public class CountDigit{
//	public static void main(String[] args) {
//		int num=12239001;
//		int count=0;
//		
//		do {
//			num=num/10;
//			count++;
//		}while(num!=0);
//		System.out.println("total  digit = " + count);
//	}
//}