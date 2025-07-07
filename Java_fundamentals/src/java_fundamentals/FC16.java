package java_fundamentals;

import java.util.Scanner;

public class FC16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit: ");
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while (temp != 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;

		}
		System.out.println(rev);

	}

}

