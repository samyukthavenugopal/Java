package BasicJava;
import java.util.*;

// to store and process data  effectively

public class Collections {

	public static void main(String[] args) {	
		
	// Array
		int arr[]= new int[10]; // length must be predefined and is fixed 
		
	//ArrayList
		
		// ArrayList is a collection
		// it is flexible and can store number of data without predefining. 
		// Supports redundancy - can have multiple similar value
		
		ArrayList<Integer> arrList = new ArrayList<Integer>(); 
		for(int i=1;i<=5;i++) {
			arrList.add(i);
		}
		System.out.println(arrList);
		System.out.println(arrList.get(4)); // we can get, set, remove, clone... a number in ArrayList
		arrList.set(2, 12);
		System.out.println(arrList);
		
		ArrayList<String> arrList1 = new ArrayList<String>(); // Generic Programming - we can pass any data type or object
		// it can store string, integer, character..
			arrList1.add("Samyuktha");
			arrList1.add("04-09-2001");
			arrList1.add("Female");
		System.out.println(arrList1);
		
	//Iterator
		Iterator<Integer> it = arrList.iterator();
		for(int i=1;i<=5;i++) {
			System.out.println(it.next()); // prints elements in arrList vertically
		}
		
		while(it.hasNext()) { // using hasNext()
			System.out.println(it.next()); // prints elements in arrList vertically
		}
		
	//LinkedList
		// stores data with pointers containing the reference of the data
		LinkedList<Integer> lList = new LinkedList<Integer>();
		for(int i=15;i<=25;i++) {
			lList.add(i);
		}
		System.out.println(lList);
		lList.add(2, 45);
		System.out.println(lList);
		
	//Set
		// cannot contain duplicate elements, stores unique elements
		// store the elements in different order
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("Sam");
		hSet.add("Venu");
		hSet.add("Rajini");
		hSet.add("Daksha");
		System.out.println(hSet);
		
		TreeSet<String> TSet = new TreeSet<String>(); // stores in alphabetical order
		TSet.add("Sam");
		TSet.add("Venu");
		TSet.add("Rajini");
		TSet.add("Daksha");
		System.out.println(TSet);
		
		
		
		
		
		
		
		
		

	}

}
