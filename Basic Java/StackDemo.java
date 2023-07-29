package BasicJava;

public class StackDemo {
	
	public static void main(String[] args) { // main class should be public for JVM to access
//
//		Stack s1 = new Stack(); 
//		s1.push(1);
//		s1.push(2);
//		s1.push(3);
//		s1.push(4);
//		s1.push(5);
//
//		
//		System.out.println("Popped element from Stack is : "+s1.pop());
//		System.out.println("Popped element from Stack is : "+s1.pop());
//		System.out.println("Popped element from Stack is : "+s1.pop());
//		System.out.println("Popped element from Stack is : "+s1.pop());
//		System.out.println("Popped element from Stack is : "+s1.pop());
//		System.out.println("Popped element from Stack is : "+s1.pop());
		
		
		Stack s2= new Stack();
		
		s2.push('A');
		s2.push('B');
		s2.push('C');
		s2.push('D');
		s2.push('E');
		//s2.s[4]='Z'; // if the access specifier for data is public it can be changed 
		//else if private the operation cannot be performed it can be accessed only within the class
		
		System.out.println("Popped element from Stack is : "+s2.pop());
		System.out.println("Popped element from Stack is : "+s2.pop());
		System.out.println("Popped element from Stack is : "+s2.pop());
		System.out.println("Popped element from Stack is : "+s2.pop());
		System.out.println("Popped element from Stack is : "+s2.pop());
		System.out.println("Popped element from Stack is : "+s2.pop());
		
	}

}
