package java_fundamentals;
import java.util.*;
public class Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of integers: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println((char)arr[i]+" ");
		}
	}

}
