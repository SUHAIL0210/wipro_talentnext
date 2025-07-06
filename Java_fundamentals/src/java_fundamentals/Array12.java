package java_fundamentals;
import java.util.*;
public class Array12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        System.out.println("Enter 3 integers for array a:");
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter 3 integers for array b:");
        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }

        int[] result = new int[2];
        result[0] = a[1];  // middle element of a
        result[1] = b[1];  // middle element of b

        System.out.print("Result array: [");
        for (int i = 0; i < 2; i++) {
            System.out.print(result[i]);
            if (i != 1) System.out.print(", ");
        }
        System.out.println("]");

        scanner.close();

	}

}
