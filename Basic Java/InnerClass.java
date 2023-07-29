package BasicJava;

// Inner class or Nested class - a class inside a class

class Outer{
	String name="Samyuktha";
	void displayName() {
		System.out.println("Outer Class");
	}
	
	class Inner{
		void displayName() {
			System.out.println("Inner Class");
		}
	}
	
	static class Inside{
		void displayName() {
			System.out.println("Inside Class");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		
		Outer o =  new Outer(); // we can create an object for outer class 
		o.displayName();
		
		// we cannot directly create an object for inner class as it is nested inside another class.
		//OuterClass.innerClass objName = outerClassObj.new innerClass
		Outer.Inner i=o.new Inner(); // we must call the object of the outer class to invoke the inner class.
		i.displayName();
		
		Outer.Inside i1=new Outer.Inside();// if the inner class is defined as static we can call by the outer class name
		i1.displayName();
		
		
	}

}
