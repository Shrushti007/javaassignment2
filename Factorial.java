package assignment1;
import java.util.Scanner;
public class Factorial {
	static int factorial(int n) {
		if(n==0 || n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		
		if(number<0)
			System.out.println("Factorial is not define for negative number.");
		else
			System.out.println("Factorial of " +number+ " is: " + factorial(number));
		
		
	}

}
