package DSA;

import java.util.PriorityQueue;

public class PriorityQueues { // Removes highest Priority which is the minimum value.

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		// PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // Removes highest Priority which is the maximum value.
	
		// put - O(log n) 
		
		pq.add(35);
		pq.add(20);
		pq.add(15);
		pq.add(25);
		pq.add(30);
		pq.add(10);

		
		System.out.println("Size of elements in Priority Queue : "+pq.size());
		
		// get - O(1)
		System.out.println("Top of element in Priority Queue : "+pq.peek());
		
		// remove -O(log n)
		System.out.println("Removed element in Priority Queue : "+pq.remove());
		
//-------------------------------------------------------------------------------------------------------------------

		// Largest K elements 
		// 1. using sorting of array - O(nlogn)
		// 2. prioritY queue - O(nlogk)
		
		int arr[] = {6,3,5,9,2,10};
		int k =3;
		
		System.out.print("Largest "+k+" Elements are : ");
		LargestK(arr,k);

	}
	
	public static void LargestK(int arr[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i=0; 
		while(i<k) {
			pq.add(arr[i]);  //pq = {6,3,5}  //After pq ={6,9,10}
			i++;
		}
		
		while(i<arr.length) {
		if(arr[i]>pq.peek()) { //arr = {6,3,5,9,2,10}  
			pq.remove();
			pq.add(arr[i]);
		}i++;
		}
		while(pq.size()>0) {
			System.out.print(pq.remove()+" ");
		}
	}

}
