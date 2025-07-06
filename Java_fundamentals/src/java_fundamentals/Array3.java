package java_fundamentals;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int index =-1;
		
		System.out.println("Enter targeted element: ");
		int tar = sc.nextInt();
		System.out.print("Enter array: ");
		for (int i = 0; i < size; i++) {
			arr[i] =sc.nextInt();
		}
		for(int i =0;i<size;i++) {
			if(arr[i]==tar) {
				index = i;
				break;
			}
			
			
		}if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("-1");
        }

	}

}
