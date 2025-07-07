package java_fundamentals;

import java.util.Scanner;

public class FC14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum=0;
		int temp =n;
		while(temp>0) {
			sum+=temp%10;
			temp = temp/10;
		}
				System.out.println("The sum of digits is: " + sum);
	}

}

