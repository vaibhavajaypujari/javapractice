package ifelse;

public class LargestThreeNumbers {

	public static void main(String[] args) {
		int a=20, b=22, c=24;
		
		if(a >= b && a >= c) {
			System.out.println("A is largest");
		}else if (b >= a && b >= c) {
			System.out.println("B is largest");
		} else {
			System.out.println("C is largest");
		}
	}
}
//largest 3 number