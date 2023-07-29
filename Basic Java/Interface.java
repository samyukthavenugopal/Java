package BasicJava;

//Interface is similar to abstract and it is created to overcome the limitations of the abstract class.
//It is used to achieve multiple inheritance which is not supported by java
//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. 
//It is used to achieve abstraction and multiple inheritance in Java. 
//In other words, you can say that interfaces can have abstract methods and variables.
//Interface defines what to do but not how to do eg., we have ride method but it has no functions or statements.
//it just acts as an reference to invoke the methods that implements it.
//we cannot create objects and constructors for an interface 

abstract class Vehicle{ //base class
	abstract void welcome();} // since the method is not defining any functions we specify it as abstract
	// when the method is abstract we must also specify the class as abstract.
	// but the problem arises when the Car class needs to extend another class.
	// so we define the class as Interface
	
interface Ridable{ // interface name must be given with *able* keyword so we give it as *Ridable*.
	 void ride(); // we need not specify the method as abstract 
	 // because all the methods given within the interface class are by default abstract and public.
	 // and the classes and methods that implements the interface class must be public.
	 // when there is only one abstract method inside an interface we call it SAM(Single Abstract Method) Interface or Functional Interface. 
	 String name="Samyuktha"; // by default the variables in interface are declared as final and static and public.
	 // we cannot declare an instance variable in an interface.
	 
	 default void display() { 
	 // we cannot define a method within the interface but updated versions of java allows it by defining the default keyword.
	 //	we can override the display() method in Car or Bike class but when we invoke the method the display method within that particular car or bike class is called. 
		 System.out.println("Ridable Interface");
	 }
	 
}

//class Car extends Vehicle{ // extending or inheriting the base class
			// we can extend only one class but we can implement multiple class using interface.
	
class Car extends Vehicle implements Ridable{ // while using inheritance we give *extends* keyword 
			// similarly while using interface we should give *implements* keyword
			// we can both extend a base class and implement an interface 

	public void ride(){
		System.out.println("You are riding a Car\n---------------------");
	}
	void welcome() {
		System.out.println("Welcome Car Class");
	}
}

class Bike implements Ridable{ // implementing the interface 
	public void ride(){
		System.out.println("You are riding a Bike"); 
	}
}

//class Lorry { // we can create an anonymous class for invoking the method within this class
//	void ride(){
//		System.out.println("You are riding a Lorry");
//	}
//}


class Mechanic{ 
	
	void show(Vehicle v) {
		System.out.println("Extends Vehicle class : Welcome..");
		v.welcome();}
		
	void check(Ridable r){ // passing Car class as argument
		System.out.println("Extends Ridable Interface : Checking..");
		r.ride();// since the ride method is referring the base class 
				 //it automatically checks and invokes the ride method based on the vehicle running.
	}
	}



public class Interface { 

	public static void main(String[] args) {
		
		//Ridable r = new Ridable(); // we cannot create object for interface class
		Ridable r = new Car(); // we can create an object for car class using Ridable class.

		Mechanic m = new Mechanic();
		Car c=new Car();
		c.display(); // invoking display method using Car object though the Car class does not have display() method.  
		m.show(c);  // invoking the show method for the car object
		m.check(c); // calling the check method for the car object
		
		Bike b= new Bike();
		//m.show(b); // we cannot invoke show method for the bike class as the bike class does not extend Vehicle class.
		m.check(b);	// if we want to use the same method for the bike object we must re-write the check method to bike
		// to simplify this task we use Interface and create a base class to refer ride method.
		
//		Lorry l=new Lorry(); 
		//m.check(l);// when we try to invoke ride method for Lorry class it shows error
		// because the Lorry class does not extend the base class which refers the ride method
		// and the check method is not specified for the lorry class
		
		// we can create an anonymous class for lorry without Lorry class 
		// we can instantiate an interface class to create an anonymous method
		Ridable r1 = new Ridable() {
			public void ride(){
				System.out.println("--------------------------\nAnonymous class : You are riding a Lorry");
			}
		};
		r1.ride();
		
		//Lambda Expression - Shorthand Notation
		//it can be used in Functional or SAM Interface where the interface contains only one abstract method and we override it using anonymous class
		Ridable r2 = () -> System.out.println("--------------------------\nAnonymous class Using Lambda: You are riding a Lorry");
		r2.ride(); // when we invoke r2 it refers Ridable class's object r2.
		// Ridable Interface contains only one abstract class ride() which now refers to our anonymous class so the message is printed.

	}

}
