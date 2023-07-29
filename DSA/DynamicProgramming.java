package DSA;

import java.util.Scanner;

public class DynamicProgramming { 
	// Dynamic Programming is a technique in computer programming that helps to efficiently 
	// solve a class of problems that have overlapping subproblems and optimal substructure property.
	
	// if we write simple recursive solution for Fibonacci Numbers, we get exponential time complexity 
	// because the statement or function is repeated until it reaches the desired output
	// and if we optimize it by storing solutions of subproblems, time complexity reduces to linear.
	
	public static void main(String[] args) {
	
// Recursion - executed statements keep repeating again and again 
		
//		fib(N)= fib(N-1) + fib(N-2)
		
//							N=5	  
//					 /		  		\
//				   N=4				N=3
//				 /	  \		   	   /   \
//			  N=3 	   N=2		 N=2   N=1
//			/	 \	  /   \		/   \
//		  N=2   N=1	 N=1  N=0  N=1  N=0
//		 /	 \
//	    N=1  N=0

		// 2,3,1,0 are repeated multiple times
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number to Find Fibonacci : ");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci Using Recursion : "+fib(n));	
		
// Top Down Approach - DRY(Do Not Repeat Yourself)
	// uses the previously stored values by memorizing it.	
	
			  		
//	(2+1=3)		 		  N=4 				
//			*2		  /	       \	*1*  (previously stored value)	   	  
//	(1+1=2)			N=3        N=2		
//			*1	   /   \	*1	  		
//	(1+0=1)		N=2    N=1	(1)   
//		    *1 /   \ 		*0
//	   		  N=1  N=0		
		
//	 ___0_______1_______2_______3_______4___
//	|		|		|		|		|		|
//	|	0	|	1	|	1	|	2	|	3	|
//	|_______|_______|_______|_______|_______|
		
		
		int dp[]=new int[n+1];
		System.out.println("Fibonacci Using Top Down Approach : "+fibTd(n,dp));	
		
// Bottom Up Approach - Iterative Approach in Array
		
// (i=2) iterates over 0 & 1 and results 1 then (i=3) iterates over 1 & 2 and returns 2 and so on.
		
		System.out.println("Fibonacci Using Bottom Up Approach : "+fibBu(n,dp));	
		
		
// Climbing Stairs problem Using Recursion
		
//	Print the total numbers of paths via which you can climb on top
//  eg : No of ways to reach 1 is 1 way, 2 is 2 ways and 3 is 111 or 21 or 12 or 3 so there are 4 ways
//  we break the problem eg: n=6 we break down to n-1, n-2, n-3 ie. 6 to 5,4,3
		
//						  	      N=6
//					   /		  (24)		  \
//					  /	           |           \ 	     
//			   	    N=5		   	  N=4          N=3
//				   /(13)\		 /(7)\	       (4)
//				  /	 | 	 \		/  |  \
//			    N=4 N=3 N=2	  N=3 N=2 N=1
//			   /(7)\(4) (2)	  (4) (2) (1)
//		  	  /  |  \
//	        N=3 N=2 N=1 	
//			(4)	(2)	(1)

		System.out.println("Climbing Stairs Problem Using Recursion : "+cs(n));
		
// Climbing Stairs problem Using Top Down Approach
// Uses previously stored memory of 4 and 3 and does not repeat recursively to reduce time complexity
		
//							N=6
//                       /  (24) \
//						/	 |    \ 	     
//					N=5		N=4    N=3
//                /(13)\		   (4)
//				 /	 | 	\		
//				N=4 N=3 N=2	  
//			   /(7)\(4) (2)	  
//			  /  |  \
//			N=3 N=2 N=1 	
//			(4)	(2)	(1)
		
		
		int dp1[]=new int[n+1];
		System.out.println("Climbing Stairs Problem Using To Down Approach : "+csTd(n,dp1));
		
// Climbing Stairs problem Using Bottom Up Approach
// we have given (i=1)=1,(i=2)=2,(i=3)=4
// (i=4) iterates over 1,2 & 3 and results 4 then (i=5) iterates over 2,3 & 4 and returns 13 and so on.
		
		System.out.println("Climbing Stairs Problem Using Bottom Up Approach : "+csBu(n,dp1));

	
// Minimum Path Sum - can traverse from top left(0,0) to bottom right(2,2)

//		0  1  2	
//	0	1  3  1    // 1st path from 1st row and 3rd column which is 1+3+1+1+1+1 = 7 (minimum path)
//	1	1  5  1	   // 2nd path is from 1st column to 3rd row 1+1+4+1+5+1 = 9
//  2	4  5  1	   // 3rd path is from (0,0),(0,1),(1,1),(1,2),(2,2) = 11
	
	int arr[][] = {{1,3,1},{1,5,1},{4,5,1}};
	int i=0,j=0;
	System.out.println("Minimum Path Sum Using Recursion : "+minPath(arr,i,j));

// Minimum Path Sum Using Top Down Approach
	
	int dp2[][]=new int[arr.length][arr[0].length];
	System.out.println("Minimum Path Sum Using Top Down Approach: "+minPathTd(arr,i,j,dp2));
	
	}
	
	
//------------------------------------------------------------------------------------------------------
	
// Using Recursion
	
	static int fib(int n) {
		if(n==0 ||n==1) {
			return n;}
		return fib(n-1)+fib(n-2);
	}

// Using Dynamic Programming - Top Down Approach
	
		static int fibTd(int n, int[]dp) {
			if(n==0 ||n==1) {
				return n;}
			if(dp[n]!=0) {
				return dp[n];
			}
			dp[n] = fib(n-1)+fib(n-2);
			return fib(n-1)+fib(n-2);
		}

// Using Dynamic Programming - Bottom Up Approach
		
		static int fibBu(int n,int dp[]) {
			dp[0]=0;
			dp[1]=1;
			
			for(int i=2;i<dp.length;i++) {
				dp[i] = dp[i-1]+dp[i-2];
				
			}
			return dp[dp.length-1];
		}
		
// Climbing Stairs problem Using Recursion
		
		
		static int cs(int n) {
			if(n==1 || n==2) {
				return n;
			}
			if(n==3) {
				return 4;
			}
			return cs(n-1)+cs(n-2)+cs(n-3);	
			
		}
		
// Climbing Stairs problem Using Top Down Approach
		
		static int csTd(int n, int dp1[]) {
			if(n==1 || n==2) {
				return n;
			}
			if(n==3) {
				return 4;
			}
			if(dp1[n]!=0) {
				return dp1[n];
			}
			dp1[n] = csTd(n-1,dp1)+csTd(n-2,dp1)+csTd(n-3,dp1);
			return csTd(n-1,dp1)+csTd(n-2,dp1)+csTd(n-3,dp1);	
			
		}
		
// Climbing Stairs problem Using Bottom Up Approach
		
		static int csBu(int n, int dp1[]) {
			dp1[1]=1;
			dp1[2]=2;
			dp1[3]=4;
			
			for(int i=4;i<dp1.length;i++) {
				dp1[i] = dp1[i-1]+dp1[i-2]+dp1[i-3];
				
			}
			return dp1[dp1.length-1];
		}

// Minimum Path Sum Using Recursion
		
		static int minPath(int arr[][], int i,int j) {
			if(i>=arr.length || j>=arr.length) {
				return Integer.MAX_VALUE;
			}
			if(i==arr.length-1 && j==arr[0].length-1) {
				return arr[i][j];
			}
			return arr[i][j]+Math.min(minPath(arr,i,j+1), minPath(arr,i+1,j));
		}
		
// Minimum Path Sum Using Top Down Approach
		
		static int minPathTd(int arr[][], int i,int j, int dp2[][]) {
			if(i>=arr.length || j>=arr.length) {
				return Integer.MAX_VALUE;
			}
			if(i==arr.length-1 && j==arr[0].length-1) {
				return arr[i][j];
			}
			if(dp2[i][j]!=0) {
				return dp2[i][j];
			}
			dp2[i][j]=arr[i][j]+Math.min(minPathTd(arr,i,j+1,dp2), minPathTd(arr,i+1,j,dp2));
			return arr[i][j]+Math.min(minPathTd(arr,i,j+1,dp2), minPathTd(arr,i+1,j,dp2));
		}
		
		
			
			
}
		
		
