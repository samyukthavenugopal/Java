package BasicJava;
import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
public class Reflection {

	private static final String COMPANY = "ABC";

	public static void main(String[] args) throws ClassNotFoundException { 
		
		// when we do not know if the defined object exists in other class we can use reflection to find out the name and info of the obj..
		Employee e1=new Employee("Sam",50000,"04-09-2001",COMPANY); // Employee object e1 already exists in Inheritance class in the same package.
		Class cls=e1.getClass(); 
		
		//Class, Methods.. are inbuilt class in reflection.
		System.out.println("Class Name : "+cls.getName());
		
		Method[] methods=cls.getMethods(); // returns all the methods used in Employee class by storing it in an array and displaying it using for each loop.
		for(Method m:methods) {
			System.out.println(m.getName());
		}

		System.out.println("------------------------------");
		
		// invoking the methods
		
		System.out.println("Directly Invoking the Method");
		e1.displayEmployee(); // Directly invoking the method if we know the methods and function
			
		// invoking the method using reflection because we do not know what the method or info is. 
		// we put it in try and catch because it may show a lot of errors as we invoke an inconsistent method.
		// invoke should be only used if necessary it may cause security problems and performance is low.
			
		System.out.println("Invoking the Method Using Reflection");
		try {
				System.out.println(methods[1].invoke(e1)); 
			} catch (IllegalAccessException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

	    
	
	}

}
