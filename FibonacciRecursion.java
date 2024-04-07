package assignment1;

public class FibonacciRecursion {

	 static int fibonacci(int n) {
		 if(n <= 1)
			 return n;
		 return fibonacci(n-1)+fibonacci(n-2);
	 }
	 public static void main(String[] args) {
		int n=10;
		System.out.println("Fibonacci Series up to " + n + " terms:");
		for(int i=1 ; i<n; i++) {
			System.out.println(fibonacci(i) + " ");
		}
	}
		
	}


