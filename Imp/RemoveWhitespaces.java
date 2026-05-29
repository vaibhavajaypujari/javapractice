package Imp;

public class RemoveWhitespaces {
	public static void main(String[] args) {

		String str = "Java Programming Language";

		String result = str.replaceAll("\\s", "");

		System.out.println("String after removing whitespaces:");
		System.out.println(result);
	}
}
