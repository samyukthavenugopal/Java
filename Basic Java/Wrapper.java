package BasicJava;

public class Wrapper {

	public static void main(String[] args) {

		//int is wrapped under a class called Integer similarly char under Character class and float under Float class etc..
		 int i=2; // Primitive data type

		// we can create an object for the integer class
		 Integer i0=Integer.valueOf(4); 
		 
		 Integer i1=3; // AutoBoxing - Compiler automatically add *Integer.valueOf()* for this statement.
		 
		 Integer i2=Integer.valueOf(i); //Boxing or Wrapping.. wrapping an primitive variable into an object
		 
		 int i3=i1.intValue(); //UnBoxing or UnWrapping.. Unwrapping an object into a primitive variable
	
		 int i4 = i0; //AutoUnboxing - Assigning a object to an primitive data.
		 
		String s="22";
		int i5=Integer.parseInt(s); // Parsing an string to an integer object.
		 
		System.out.println("Primitive : "+i+"\nInteger Object Class : "+i0+"\nAutoBoxing : "+i1
		+"\nBoxing or Wrapping : "+i2+"\nUnBoxing or Unwrapping : "+i3+"\nAutoUnboxing : "+i4+"\nParsing an String : "+i5);
		 
	}

}
