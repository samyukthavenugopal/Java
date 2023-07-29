package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
//		 Reverse an array
		
//	      int arr[]=new int[5];
//	      Scanner sc=new Scanner(System.in);
//	      System.out.print("Enter the number of Array : ");
//	      for(int i=0;i<arr.length;i++)
//	       arr[i]=sc.nextInt();
//	      
//	      int i=0,j=arr.length-1;
//	      
//		while(i<j) {
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;	
//			i++;
//			j--;
//		}
//		
//		for(int k=0;k<arr.length;k++)
//		System.out.print(arr[k]+" ");
		
		
//		SubArrays -> Contiguous Part of an Array {1,2,3},{1},{2},{3},{1,2},{2,3} 
		
//	      int arr[]=new int[3];
//	      Scanner sc=new Scanner(System.in);
//	      System.out.print("Enter the number of Array : ");
//	      for(int i=0;i<arr.length;i++)
//	       arr[i]=sc.nextInt();
//	      
//	      for(int si=0;si<arr.length;si++) {
//	    	  for(int ei=si;ei<arr.length;ei++) {
//	    		  
//	    		  for(int k=si;k<=ei;k++) {
//	    				System.out.print(arr[k]+" ");
//	    		  }
//	    		  System.out.println();
//	    	  }
//	      }
		
//		 Transpose of a Matrix
		
//	      int arr[][]=new int[4][4];
//	      Scanner sc=new Scanner(System.in);
//	      System.out.print("Enter the Array Elements for 3*3 dim\n");
//	      for(int i=0;i<arr.length;i++) {
//	    	  for(int j=0;j<arr[0].length;j++) {
//	    		   arr[i][j]=sc.nextInt();
//	    	  }
//	      }
//		
////		int arr[][]={{1,2,3,4},
////					 {5,6,7,8},
////					 {9,10,11,12},
////					 {13,14,15,16}};
//	      
//	      for(int i=0;i<arr.length;i++) {
//	    	  for(int j=0;j<i;j++) {
//	    		  int temp = arr[i][j];
//	    		  arr[i][j]=arr[j][i];
//	    		  arr[j][i]=temp;  
//	    	  }
//	      }
//	      
//	      System.out.print("---------------------\nTranspose of a Matrix\n---------------------\n");
//		  for(int i=0;i<arr.length;i++) {
//			  for(int j=0;j<arr[0].length;j++) {
//				  System.out.print(arr[i][j]+" ");
//			  }
//			  System.out.println();	
//		  }

////Rotate 2D Array Clockwise by 90 Degrees.
//		
//	      int arr[][]=new int[3][3];
//	      Scanner sc=new Scanner(System.in);
//	      System.out.print("Enter the Array Elements for 3*3 dim\n");
//	      for(int i=0;i<arr.length;i++) {
//	    	  for(int j=0;j<arr[0].length;j++) {
//	    		   arr[i][j]=sc.nextInt();
//	    	  }
//	      }
//		
////		int arr[][]={{1,2,3,4},
////					 {5,6,7,8},
////					 {9,10,11,12},
////					 {13,14,15,16}};
//	      
//	      for(int i=0;i<arr.length;++i) {
//	    	  for(int j=0;j<i;++j) {
//	    		  int temp = arr[i][j];
//	    		  arr[i][j]=arr[j][i];
//	    		  arr[j][i]=temp; 
//	    	  }
//	      }
//	      
//	      for(int i=0;i<arr.length;++i)
//	        {
//	            for(int j=0;j<arr.length/2;++j)
//	            {
//	                int temp =arr[i][j];
//	                arr[i][j] = arr[i][arr.length-j-1];
//	                arr[i][arr.length-j-1]=temp;
//	            }
//	        }
//	      
//	      System.out.print("---------------------------------------\nRotate 2D Array Clockwise by 90 Degrees\n---------------------------------------\n");
//		  for(int i=0;i<arr.length;i++) {
//			  for(int j=0;j<arr[0].length;j++) {
//				  System.out.print(arr[i][j]+" ");
//			  }
//			  System.out.println();	
//		  }
		
		
	// Remove Even Numbers from the array List
	     
	      ArrayList<Integer> arr = new ArrayList<Integer>();
	      
	      arr.add(1);
	      arr.add(2);
	      arr.add(3);
	      arr.add(4);
	      arr.add(5);
	      arr.add(8);
	      arr.add(12);
	      arr.add(18);
	      System.out.println("ArrayList : "+arr);
	    
	      
	      for(int i=0;i<arr.size();i++) {
			if (arr.get(i)%2==0)
				arr.remove(i);
			}
	      
//	      for(int i=arr.size()-1;i>=0;i--) {
//			if ((arr.get(i)%2)==0)
//				arr.remove(i);
//			}
	      
	      System.out.println("ArrayList after Even Elements are Removed : "+arr);

	}

}
