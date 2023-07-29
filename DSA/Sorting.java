package DSA;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		
// Sorting

		int arr[] = {4,7,6,9,3,-2,5};
		System.out.print("Before Sorting : ");
		for(int a1:arr) {
			System.out.print(a1+" ");}
		selectionSort(arr);
		bubbleSort(arr);	
		InsertionSort(arr);
		
	}

	//Selection Sort - Swapping (Compare 1st element with all other elements and 
		//swaps the element smaller) --- Order the array in ascending order.
	
	private static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minval = arr[i];
			int minidx = i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<minval) {  // > for descending order
				minval = arr[j];
				minidx = j;
			}
		}
		
		int temp = arr[i];
		arr[i] = arr[minidx];
		arr[minidx] = temp;
		
		}
		
		System.out.print("\nAfter Selection Sorting : ");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
		
	
	// Bubble Sort - Adjacent Swapping - j,j+1,(j+1)+1...(Adjacently compares elements and 
		//swaps immediately if it is smaller or larger) - orders elements(ascend or descend) from reverse.
		
	private static void bubbleSort(int[] arr) {
		
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
			
			System.out.print("\nAfter Bubble Sorting : ");
			for(int a:arr) {
				System.out.print(a+" ");
			}
	}
	
	//Insertion Sort - Key Sort - [4,7,6,9,3,-2,5] key is 7(arr[1]) compare 7 with 4, if key is smaller shift else 
		//set key to 6 compare element 7 and 4 to key=6, check if it is smaller and shift and set key to 9 and compare...
	
	private static void InsertionSort(int[] arr) {
		
	for(int i=1;i<arr.length;i++) {
		int key = arr[i];
		int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
			System.out.print("\nAfter Bubble Sorting : ");
			for(int a:arr) {
				System.out.print(a+" ");
			}
	}
	
	// Double pivot Sort - Arrays.sort(arr); Time Complexity : O(nlogn) Worst Case : O(n2) - Takes time to load
	
	// Merge Sort - Collections.sort(list); copy arr to Array list -  Time Complexity  :O(n2)
		
		
		
		
		
		
		
		
		
		
		
	}

