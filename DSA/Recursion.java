package DSA;
import java.util.*;
import java.util.Arrays;
public class Recursion {
	
// Sum of n Numbers 

	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return sum(n-1)+n;
	}
	
// Print n increasing numbers
	
	static void num(int n1) {
		if(n1==0) {
			return;
		}
		num(n1-1);
		// n1=n1*2;  // Print Multiples of a table 
			System.out.print(n1+" ");	
	}
	
// Elements in an array
	
	static void array(int arr[],int i) {
		if(i==arr.length) {
			return;
		}
		System.out.print(arr[i]+" ");
		array(arr,i+1);
	}

// First Index in Array
	
	static int index(int arr1[], int x, int i) {
		if(i==arr1.length) {
			return -1;
		}
		
		if(arr1[i] == x) {
			return i;
		}
		else {
			return index(arr1,x,i+1); // returning the index
		}
		
	}

// Factorial if a number
	
	static int fact(int n2) {
		if(n2 == 0) 
			return 1; 
		return n2*fact(n2-1);
	}
	
	
	public static void main(String[] args) {
		
	// Sum of n Numbers 

		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the Number to find Sum: ");
		int n = sc.nextInt();
		System.out.println("Sum of Numbers between "+n+" : "+sum(n));

	// Print n increasing numbers
		System.out.print("Enter a number to find the Series : ");
		int n1 = sc.nextInt();
		num(n1);
	
	//	Elements in an array
		System.out.print("\nEnter a Elements of an Array : ");
		int arr[]= new int[5];
		for(int i =0;i<arr.length;i++) {
		arr[i] = sc.nextInt();}

		array(arr,0);
	
	// First Index in Array
		
		int arr1[]= {2,4,6,8,9,3,2,6};
		int x = 9;
		System.out.print("\nIndex of the Element "+x+" is : "+index(arr1,x,0));

	// Factorial if a number
		System.out.print("\nEnter a number to find the Factorial : ");
		int n2 = sc.nextInt();
		System.out.print("Factorial of the Number "+n2+" is : "+fact(n2));
		
		
		
		
		
		
		
	}

}
