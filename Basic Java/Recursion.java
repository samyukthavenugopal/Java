package BasicJava;
import java.util.*;

public class Recursion { // calling a method inside the method 
	
	
	// Factorial of a number
	static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	
	// Fibonacci Series
	static int fib(int num) {
		if (num<=1)
			return 1;		
		return fib(num-1)+fib(num-2);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Factorial of a number
		System.out.print("Enter a number to find the Factorial : ");
		int n=sc.nextInt();
		System.out.print("Factorial of the number is : "+fact(n));
		
		// Fibonacci Series
		System.out.println();
		System.out.print("Enter a number to find the Fibonacci Series : ");
		int num=sc.nextInt();
		
		System.out.print("Fibonacci Series of the number is : ");
		for(int i=0;i<num;i++) {
		System.out.print(fib(i)+", ");}
		System.out.println();
		System.out.print("Sum Fibonacci Series of the number is : "+fib(num));
		

	}

}
