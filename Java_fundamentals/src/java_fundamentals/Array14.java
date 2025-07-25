package java_fundamentals;
import java.util.*;
public class Array14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println("Enter 9 integer numbers:");

        for (int i = 0; i < 9; i++) {
            arr[i / 3][i % 3] = scanner.nextInt();
        }

        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("The biggest number in the given array is " + max);

        scanner.close();
	}

}

