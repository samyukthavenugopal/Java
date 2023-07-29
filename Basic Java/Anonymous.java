package BasicJava;

class Cycle{
	void display() {
		System.out.println("This is a Cycle Class");
	}
}
class TriCycle extends Cycle{
	void display() { // we override the display() method from Cycle class
		System.out.println("This is a TriCycle Class");
	}
}

//class NewCycle{ // invoking the display method for this class without creating the class and calling it using the object of the Cycle class.
//	void display() { // we override the display() method from Cycle class
//		System.out.println("This is a NewCycle Class");
//	}
//}


public class Anonymous { // anonymous class is used when the class needs to only invoke an overrided method.
	// when we only want to use the anonymous method object only once and it is not reusable we can create one.

	public static void main(String[] args) {

		Cycle c = new Cycle(); // creating an object for a class Cycle
		c.display();		  // displaying the statements in Cycle class by invoking the method
		
		// we invoke the method in TriCycle class by creating an object using Cycle class which is extending TriCycle class.
		Cycle c1 = new TriCycle(); 
		c1.display();
		
		Cycle c2 = new Cycle() { // creating an object for cycle class
			// Anonymous Class - creating an object and defining the method(overrided method - display()) within the object and without an class
			
		void display() { // we invoke the display() method for a new class without creating the class.
			// when the display method is invoked the message written here is displayed instead of the message in the Cycle class.
			System.out.println("This is a NewCycle Class");
		}		
	};
		c2.display(); // invoking the anonymous class method using Cycle class.
	}

}
