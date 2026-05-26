package Imp;

public class LCM {

	public static void main(String[] args) {

		int num1 = 12;
		int num2 = 18;
		int lcm;

		int max = (num1 > num2) ? num1 : num2;

		while (true) {

			if (max % num1 == 0 && max % num2 == 0) {
				lcm = max;
				break;
			}

			max++;
		}

		System.out.println("LCM: " + lcm);
	}
}
