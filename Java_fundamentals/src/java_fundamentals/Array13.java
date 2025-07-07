package java_fundamentals;
import java.util.*;
public class Array13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 4 integer numbers:");

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The given array is :");
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println(arr[2] + " " + arr[3]);

        System.out.println("The reverse of the array is :");
        System.out.println(arr[3] + " " + arr[2]);
        System.out.println(arr[1] + " " + arr[0]);

        scanner.close();
	}

}

