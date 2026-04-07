package whileLoop;

import java.util.Scanner;

public class FactUsingScanner  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;
        int fact = 1;

        while(i <= num) {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial = " + fact);
    }


}
