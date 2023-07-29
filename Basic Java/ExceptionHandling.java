package BasicJava;
import java.util.*;

// error handling - handle incoming error without stoping the program
// checked exception - compiler identifies error before compiling and suggests to add try and catch.

public class ExceptionHandling {

	public static void main(String[] args) {

		int a=12, b=3; 
		int c=0 ; //we should not divide by zero it shows error
		// to handle the error and give custom message instead of the error we use exception handling
		// here we use try and catch method to get and receive the error and show the stored message
		
		try { // a try block can have multiple catch block and executes the first defined error in this case error for array is printed.
			
			c=a/b; // throws error if divided by 0
			System.out.println(a+" / "+b+" = "+c); // this statement is executed if there is no error.
			
			int arr[]=null;
			System.out.println(arr[1]); // displays error NullPointerException 
			
			
		}
		catch(ArithmeticException e) { // every error is stored in the exception class so we create an object to display our desired way to handle the error.
			// Exception class derives the RunTimeException class this derives another class called ArithmethicException
			System.err.println("Error : Cannot divide by 0"); // this object is invoked if a value is divided by zero and prints this message.
			// special print statement for error, displays in red color.
		}
		catch(NullPointerException e) { // Exception class derives various other class such as NullPointerException so we could also simply specify Exception in catch.
			System.err.println("Error : Array is Empty or Null"); // this object is invoked if a value is divided by zero and prints this message.
		}
		
	//	catch(ArithmeticException | NullPointerException e) { // we can provide two or more errors within catch block. it either executes one of them.
	//		System.err.println("Some Error has Occurred"); // this object is invoked if a value is divided by zero and prints this message.
	//	}
		
		catch(Exception e) {
			System.err.println("Error Occured"); // we can provide a default catch block to get any errors that is not defined and prints this default message. 
			// It should always be defined at last.
		}
		finally {
			System.out.println("From finally Block"); // this statement gets executed either if there is an error or not.
		}
		
		double bal, withdraw = 700;
		
		// when we invoke an scanner class we must always close it using scanner.close() 
		// else we can add it within try which automatically closes it.
		// it is called as *try with resources*
		
		try(Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter your amount");
			bal = sc.nextInt();
		}
		System.out.println("Checking...");
		
		// we can create an exception manually which is called as user defined exception
		
		
		try {
		if(bal<withdraw)
			throw new InsufficientFundException(withdraw-bal);
		}
		catch(InsufficientFundException e){
			System.out.println("Not Enough Money!");
		}
		
	}

}
