package java_fundamentals;

import java.util.Scanner;

public class FC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character 1: ");
		char ch1 = sc.next().charAt(0);
		System.out.print("Enter character 2: ");
		char ch2 = sc.next().charAt(0);
		if(ch1 > ch2)
			System.out.print(ch2 +"," + ch1);
		else if(ch1 < ch2)
			System.out.print(ch1 + "," + ch2);
	}

}

