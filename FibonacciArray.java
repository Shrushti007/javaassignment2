package assignment1;

public class FibonacciArray {

	public static void main(String[] args) {
		int n=10;
		int[] fib =new int[n];
		fib[0]=1;
		fib[1]=2;
		System.out.println("Fibonacci Series up to" +n+ " terms :" );
		System.out.println(fib[0]+"\n "+ fib[1] + " ");
		for(int i=2; i<n; i++) {
			fib[i]=fib[i-1]+ fib[i-2];
			System.out.println(fib[i]+ " ");
		}

	}

}
