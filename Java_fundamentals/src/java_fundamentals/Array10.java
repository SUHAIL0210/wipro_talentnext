package java_fundamentals;
import java.util.*;
public class Array10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = new int[n];
        int index = 0;

        // Add even numbers first
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        // Then add odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        System.out.print("Rearranged array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i != n - 1) System.out.print(", ");
        }
        System.out.println("]");

        scanner.close();
	}

}
