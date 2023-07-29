package DSA;

public class LinkedList {
	
	public static class Node{
		int data;
		Node next;
		
		Node(int val){
			this.data = val;
			this.data = data;
			this.next = null;
		}
	}
	
	// Insert an element at the beginning of the linked list
	
	public static Node addFirst(Node head, int val) {
	
	Node n = new Node(val);
	n.next = head;
	head = n;
	return head;
	
	}
	
	// Insert an element at the End of the linked list
	
	public static Node addLast(Node head, int val) {		

	Node n = new Node(val);
	Node tail = head;
	while (tail.next != null) {
		tail = tail.next;
	}
	tail.next=n;
	return head;	
	
	}

	// Insert an element at the Middle of the linked list
	
	public static Node addAt(Node head, int val, int idx) {	
		
		if(head == null || idx == 0) {
			addFirst(head, val);
		}

	Node n = new Node(val);
	Node temp = head;
	for(int i=1;i<=idx-1;i++) {
		temp = temp.next;
	}
	Node tempp1 = temp.next;
	temp.next = n;
	n.next = tempp1;
	return head;
	
	}
	
	// Remove the First or Head element of the linked list
	
	public static Node RemoveFirst(Node head) {
		
		if(head == null) {
			return null;
		}
		
		head = head.next;
		return head;
		
		}
	
	// Remove the Last or Tail element of the linked list
	
	public static Node RemoveLast(Node head) {		

		if(head == null || head.next == null) { // no node in linked list || one node in linked list
			head = head.next;
			return head;
		}
		Node tail = head;
		while (tail.next.next != null) {
			tail = tail.next;
		}
		tail.next=null;
		return head;	
		
		}
	
	// Remove an element at the Middle of the linked list
	
	public static Node RemoveAt(Node head, int idx) {	
		
		if(head == null || idx ==0 ) {
			
			return RemoveFirst(head);
		}
		
	Node temp = head;
	for(int i=1;i<=idx-1;i++) {
		temp = temp.next;
	}
	Node tempp1 = temp.next.next;
	temp.next = null;
	temp.next = tempp1;
	return head;
	
	}
	
	// Count of Linked list elements
	
	public static int Count(Node head) {
	
	int count = 0;
	Node temp = head;
	while(temp != null) {
		count++;
		temp = temp.next;}
	return count;
	}
	
	// Search an Element in a Linked list
	
	public static boolean Search(Node head, int val) {

	Node temp = head;
	while(temp != null) {
		if (temp.data == val) {
			return true;
		}
		temp = temp.next;}
	return false;
	}
	
	// Find the Middle Element in a Linked list
	
	public static void MidEle(Node head) {

		if(head != null) {
			int length = Count(head);
			Node temp = head;
			int middleLength = length / 2;
			while (middleLength != 0) {
				temp = temp.next;
				middleLength--;
			}
			System.out.print(temp.data);
			System.out.println();
		}
	}
	
	

// ---------------------------------------------------------------------------------------------------

	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(15);
		Node n3 = new Node(20);
		Node n4 = new Node(25);
		Node n5 = new Node(30);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		Node head = n1;
		
	// Insert an element at the beginning of the linked list
		
//		head = addFirst(head,5);
		
	// Insert an element at the End of the linked list

//		head = addLast(head,35);
		
	// Insert an element at the Middle of the linked list
	
//		head = addAt(head, 12, 1); 
		
	// Remove the Head element of the linked list
		
//		head = RemoveFirst(head);
		
	// Remove the Last or Tail element of the linked list
		
//		head = RemoveLast(head);
		
	// Remove an element at the Middle of the linked list
		
//		head = RemoveAt(head, 1);
	
		
	// Count of Linked list elements
	
//		System.out.print("Count of Elements in Linked list is : "+Count(head));
	
	// Search an Element in a Linked list
	
//		System.out.print("\nIs the Element there in Linked list : "+Search(head, 15));
		
	// Find the Middle Element in a Linked list
		
//		System.out.print("Middle Element in Linked list is : ");  MidEle(head);
		
		
		Node temp = head;    	// Printing the Linked List 
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}

		



	}
}
