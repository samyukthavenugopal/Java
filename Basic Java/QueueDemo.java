package BasicJava;

import java.util.*;

public class QueueDemo {
	public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<>();
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	q.add(5);

	System.out.println("First or Head Element in Queue is : "+q.peek());
	System.out.println("Elements in Queue is : "+q);	
	System.out.println("Popped element from Queue is : "+q.remove()); // if elements are not there it shows error
	System.out.println("Popped element from Queue is : "+q.poll()); // if elements are not there it shows Null
	
	PriorityQueue<Integer> q1 = new PriorityQueue<>(); // ordered in ascending while storing
	
	q1.add(33);
	q1.add(25);
	q1.add(54);
	q1.add(43);
	q1.add(52);
	
	System.out.println("Elements in Queue is : "+q1);	
	System.out.println("First or Head Element in Queue is : "+q1.peek());
	System.out.println("Popped element from Queue is : "+q1.remove()); 
	
	}
}
