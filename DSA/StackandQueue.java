package DSA;
import java.util.*;
import java.util.LinkedList;
public class StackandQueue {

	public static void main(String[] args) {
		
		System.out.println("\n-----------------STACK-----------------\n"); // Last in First out
		
		Stack<Integer > st = new Stack<>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.print("No of Elements in Stack : "+st.size());
		System.out.print("\nElements in the Stack : ");
		for(int i : st) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nPeeked Element : "+st.peek()); // To find or Look at the top most element
		System.out.println("Poped Element : "+st.pop()); // To remove element from top of stack
		System.out.println("Removed Element : "+st.remove(1)); // To remove the any element
		
		System.out.print("Elements in the Stack after : ");
		for(int i : st) {
			System.out.print(i+" ");
		}

//----------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n\n-----------------QUEUE-----------------\n"); // First in First out
		
		Queue<Integer> q = new ArrayDeque<>();
		
		q.offer(5);
		q.offer(10);
		q.offer(15);
		q.add(20);
		q.add(25);
		
		System.out.print("No of Elements in Queue : "+q.size());
		System.out.print("\nElements in the Queue : ");
		for(int j : q) {
			System.out.print(j+" ");
		}
		
		System.out.println("\nPeeked Element : "+q.peek()); // To find or Look at the top most element
		System.out.println("Removed Element : "+q.remove()); // To remove the element from top of queue
		System.out.println("Removed Element : "+q.remove(20)); // To pass an element and if element in queue remove the element
		
		System.out.print("Elements in the Queue after : ");
		for(int j : q) {
			System.out.print(j+" ");
		}
		
//-------------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n\n---------STACK Using Linkedlist---------\n");
		
		LinkedList<Integer> stack = new LinkedList<>();
		
		stack.addFirst(10); //addLast is expensive
		stack.addFirst(15);
		stack.addFirst(20);
		stack.addFirst(25);
		stack.addFirst(30);
		
		System.out.print("Remove First Stack : "+stack.removeFirst()); // Removes the last inserted element
		
//-------------------------------------------------------------------------------------------------------------------

		System.out.println("\n\n---------QUEUE Using Linkedlist---------\n");
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		queue.addLast(10);  //
		queue.addLast(15);
		queue.addLast(20);
		queue.addLast(25);
		queue.addLast(30);
		
		System.out.println("Remove First Queue : "+queue.removeFirst()); // Removes the last inserted element
		
//-------------------------------------------------------------------------------------------------------------------	
		
		System.out.println("\n--Reverse the first K elements in QUEUE--\n");	
		
		Queue<Integer> qu = new ArrayDeque<>();
		
		qu.offer(5);
		qu.offer(10);
		qu.offer(15);
		qu.add(20);
		qu.add(25);
		
		reverse(qu,3);
		
	}
//-------------------------------------------------------------------------------------------------------------------
	
		public static void reverse(Queue<Integer> qu, int k) {
			
			System.out.print("Elements in the Queue before Reverse : ");
			for(int i : qu) {
				System.out.print(i+" ");
			}
			
			Stack<Integer> stack = new Stack<>();
			
			for(int i=0;i<k;i++) {
				stack.push(qu.remove());
			}
			
			for(int i =0;i<k;i++) {
				qu.add(stack.pop());
			}
			
			int count = qu.size()-k;
			
			for(int i=0;i<count;i++) {
				qu.add(qu.remove());	
			}	
			
			System.out.print("\nQueue after Reversing first "+k+" elements : ");
			for(int i : qu) {
				System.out.print(i+" ");
			}

			
		}

		
		
		

	}
