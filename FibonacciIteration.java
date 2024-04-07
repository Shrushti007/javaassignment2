package assignment1;

public class FibonacciIteration {

	public static void main(String[] args) {
		int n=10;
		int a=1,b=2,c;
		System.out.println("Fibonacci Series up to " + n +" terms:");
		for(int i=1;i<n;i++){
			System.out.println(a + " ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
