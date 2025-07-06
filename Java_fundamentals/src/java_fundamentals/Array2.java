package java_fundamentals;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max=0;
		int min=0;
		System.out.print("Enter array: ");
		for (int i = 0; i < size; i++) {
			arr[i] =sc.nextInt();
		}
		for(int i =0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i]<max){
				min=arr[i];
			}
			
		}System.out.println("The Maximum number in array is: " + max);
		System.out.println("The Minimum number in array is: " + min);

	}

}
