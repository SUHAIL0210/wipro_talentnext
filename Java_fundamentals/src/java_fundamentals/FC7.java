package java_fundamentals;

import java.util.Scanner;

public class FC7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (Character.isLowerCase(ch)) {
			char ch1 = Character.toUpperCase(ch);
			System.out.println(ch + " -> " + ch1);
		} else {
			char ch2 = Character.toLowerCase(ch);
			System.out.println(ch + " -> " + ch2);
		}

	}

}

