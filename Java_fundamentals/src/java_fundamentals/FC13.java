package java_fundamentals;

public class FC13 {

	
		static boolean isPrime(int n) {
	        if (n <= 1) return false;

	        for (int i = 2; i < n; i++) {
	            if (n % i == 0) return false;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        System.out.println("Prime numbers from 10 to 99 are:");

	        for (int num = 10; num <= 99; num++) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }

	

}

