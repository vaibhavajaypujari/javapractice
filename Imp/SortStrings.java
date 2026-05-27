package Imp;

import java.util.Arrays;

public class SortStrings {

	public static void main(String[] args) {

		String[] names = { "Vaibhav", "Aman", "Rohit", "Kunal" };

		Arrays.sort(names);

		System.out.println("Sorted Strings:");

		for (String name : names) {
			System.out.println(name);
		}
	}
}
