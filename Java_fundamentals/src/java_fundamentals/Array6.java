package java_fundamentals;
import java.util.Arrays;
public class Array6 {

	public static void main(String[] args) {
		int[] numbers = {42, 12, 8, 73, 25, 17};

        Arrays.sort(numbers);

        System.out.print("Sorted array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
	}

}

