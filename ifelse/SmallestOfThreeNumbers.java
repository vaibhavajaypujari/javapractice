package ifelse;

public class SmallestOfThreeNumbers {
	
	public static void main(String[] args) {
		int a =45;
		int b =40;
		int c =50;
		
		if(a<=b && a<=c) {
			System.out.println("A is small");
		}else if(b<=a && b<=c) {
			System.out.println("B is small");
		}else {
			System.out.println("C is small");
		}
	}

}


//practice

//
//public class SmallestOfThreeNumbers{
//	public static void main(String[] args) {
//		int p=50;
//		int q=45;
//		int r=44;
//		
//		if(p<=q&&p<=r) {
//			System.out.println("p is small");
//		} else if(q<=r&&q<=p){
//           System.out.println("q is small");
//		}else {
//			System.out.println("r is small");
//		}
//	}
//}



//public class SmallestOfThreeNumbers{
//	public static void main(String[] args) {
//		int x=15;
//		int y=20;
//		int z=10;
//		
//		if(x<=y && x<=z) {
//			System.out.println("X is small");
//		} else if(y<=x && y<=z) {
//			System.out.println("Y is small");
//		} else {
//			System.out.println("Z is small");
//		}
//	}
//}