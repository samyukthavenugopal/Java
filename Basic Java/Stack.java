package BasicJava;

public class Stack {
	
	
	//Stack Operation using Integer 
	
//	int s[] = new int[10];
//	int tos;
//	
//	Stack() {
//		tos=-1;
//	}
//	
//	void push(int item) {
//		if(tos==5)
//			System.out.println("Stack is full");
//		else
//			s[++tos]=item;
//	}
//
//	int pop() {
//		if (tos>=0)
//		 return s[tos--];
//		else
//			System.out.println("Stack is Empty or Underflow");
//		 return -1;
//	}
	
	
	//Stack using Character 
	
	private char s[]= new char[5]; //Accessed within the class
	int tos; // if the access specifier is not given it is access as *default* - can be accessed within that package
	
	Stack(){
		tos = -1;
		
	}
	
	public void push(char item) {  // Methods are mostly defined public and data are defined private
		if (tos>=5)
			System.out.println("Overflow");
		else
			s[++tos]=item;
	}
	
	char pop(){
		if (tos>=0)
			return s[tos--];
		else
			System.out.println("Stack Underflow");
			return '-';
			
	}
	

}
