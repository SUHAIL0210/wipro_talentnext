package java_fundamentals;
import java.util.*;
public class Array11 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        boolean only14 = true;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] != 1 && arr[i] != 4) {
	                only14 = false;
	                break;
	            }
	        }

	        System.out.println(only14);

	        scanner.close();

	}

}

