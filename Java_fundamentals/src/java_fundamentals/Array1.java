package java_fundamentals;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum=0;
		int avg=0;
		System.out.print("Enter array: ");
		for (int i = 0; i < size; i++) {
			arr[i] =sc.nextInt();
		}
		for(int i =0;i<size;i++) {
			sum+=arr[i];
			avg=sum/size;
		}
		System.out.println("The sum of Array is: " + sum);
		System.out.println("The average of Array is: " + avg);

	}

}
