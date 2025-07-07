package java_fundamentals;
import java.util.*;
public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                skip = true;
            }

            if (!skip) {
                sum += arr[i];
            }

            if (skip && arr[i] == 7) {
                skip = false;
            }
        }

        System.out.println("Sum: " + sum);

        scanner.close();

	}

}

